@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile

@CdkDslMarker
public class CfnDeviceProfileLoRaWANDeviceProfilePropertyDsl {
  private val cdkBuilder: CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder =
      CfnDeviceProfile.LoRaWANDeviceProfileProperty.builder()

  private val _factoryPresetFreqsList: MutableList<Number> = mutableListOf()

  public fun classBTimeout(classBTimeout: Number) {
    cdkBuilder.classBTimeout(classBTimeout)
  }

  public fun classCTimeout(classCTimeout: Number) {
    cdkBuilder.classCTimeout(classCTimeout)
  }

  public fun factoryPresetFreqsList(vararg factoryPresetFreqsList: Number) {
    _factoryPresetFreqsList.addAll(listOf(*factoryPresetFreqsList))
  }

  public fun factoryPresetFreqsList(factoryPresetFreqsList: Collection<Number>) {
    _factoryPresetFreqsList.addAll(factoryPresetFreqsList)
  }

  public fun factoryPresetFreqsList(factoryPresetFreqsList: IResolvable) {
    cdkBuilder.factoryPresetFreqsList(factoryPresetFreqsList)
  }

  public fun macVersion(macVersion: String) {
    cdkBuilder.macVersion(macVersion)
  }

  public fun maxDutyCycle(maxDutyCycle: Number) {
    cdkBuilder.maxDutyCycle(maxDutyCycle)
  }

  public fun maxEirp(maxEirp: Number) {
    cdkBuilder.maxEirp(maxEirp)
  }

  public fun pingSlotDr(pingSlotDr: Number) {
    cdkBuilder.pingSlotDr(pingSlotDr)
  }

  public fun pingSlotFreq(pingSlotFreq: Number) {
    cdkBuilder.pingSlotFreq(pingSlotFreq)
  }

  public fun pingSlotPeriod(pingSlotPeriod: Number) {
    cdkBuilder.pingSlotPeriod(pingSlotPeriod)
  }

  public fun regParamsRevision(regParamsRevision: String) {
    cdkBuilder.regParamsRevision(regParamsRevision)
  }

  public fun rfRegion(rfRegion: String) {
    cdkBuilder.rfRegion(rfRegion)
  }

  public fun rxDataRate2(rxDataRate2: Number) {
    cdkBuilder.rxDataRate2(rxDataRate2)
  }

  public fun rxDelay1(rxDelay1: Number) {
    cdkBuilder.rxDelay1(rxDelay1)
  }

  public fun rxDrOffset1(rxDrOffset1: Number) {
    cdkBuilder.rxDrOffset1(rxDrOffset1)
  }

  public fun rxFreq2(rxFreq2: Number) {
    cdkBuilder.rxFreq2(rxFreq2)
  }

  public fun supports32BitFCnt(supports32BitFCnt: Boolean) {
    cdkBuilder.supports32BitFCnt(supports32BitFCnt)
  }

  public fun supports32BitFCnt(supports32BitFCnt: IResolvable) {
    cdkBuilder.supports32BitFCnt(supports32BitFCnt)
  }

  public fun supportsClassB(supportsClassB: Boolean) {
    cdkBuilder.supportsClassB(supportsClassB)
  }

  public fun supportsClassB(supportsClassB: IResolvable) {
    cdkBuilder.supportsClassB(supportsClassB)
  }

  public fun supportsClassC(supportsClassC: Boolean) {
    cdkBuilder.supportsClassC(supportsClassC)
  }

  public fun supportsClassC(supportsClassC: IResolvable) {
    cdkBuilder.supportsClassC(supportsClassC)
  }

  public fun supportsJoin(supportsJoin: Boolean) {
    cdkBuilder.supportsJoin(supportsJoin)
  }

  public fun supportsJoin(supportsJoin: IResolvable) {
    cdkBuilder.supportsJoin(supportsJoin)
  }

  public fun build(): CfnDeviceProfile.LoRaWANDeviceProfileProperty {
    if(_factoryPresetFreqsList.isNotEmpty())
        cdkBuilder.factoryPresetFreqsList(_factoryPresetFreqsList)
    return cdkBuilder.build()
  }
}
