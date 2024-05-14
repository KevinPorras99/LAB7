package cr.ac.una.controlfinancierocamera.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cr.ac.una.controlfinancierocamera.entity.Movimiento
import cr.ac.una.controlfinancierocamera.entity.Movimientos

import kotlinx.coroutines.withContext

class movimientoViewModel : ViewModel() {
    private val _ListLiveData: MutableLiveData<List<Movimiento>> = MutableLiveData()
    val textLiveData: LiveData<List<Movimiento>> = _ListLiveData

    fun updateData(movimientos: List<Movimiento>) {
        _ListLiveData.value = movimientos
    }
}