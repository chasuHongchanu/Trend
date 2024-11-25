import axiosInstance from './axiosInstance'

export const tradeApi = {
  getReservation(formData) {
    return axiosInstance.get('/trade/reservation', {
      params: formData,
      headers: {
        'Content-Type': 'multipart/form-data',
        Authorization: `${localStorage.getItem('auth') ? JSON.parse(localStorage.getItem('auth')).accessToken : ''}`,
      },
    })
  },

  createReservation(requestBody) {
    return axiosInstance.post('/trade/reservation', requestBody, {
      headers: {
        'Content-Type': 'application/json',
        Authorization: `${localStorage.getItem('auth') ? JSON.parse(localStorage.getItem('auth')).accessToken : ''}`,
      },
    })
  },

  getTradeDetail(tradeId) {
    return axiosInstance.get(`/trade/detail/${tradeId}`, {
      headers: {
        'Content-Type': 'application/json',
        Authorization: `${localStorage.getItem('auth') ? JSON.parse(localStorage.getItem('auth')).accessToken : ''}`,
      },
    })
  },

  updateReservation(requestBody) {
    return axiosInstance.put('/trade/reservation', requestBody, {
      headers: {
        'Content-Type': 'application/json',
        Authorization: `${localStorage.getItem('auth') ? JSON.parse(localStorage.getItem('auth')).accessToken : ''}`,
      },
    })
  },
}
