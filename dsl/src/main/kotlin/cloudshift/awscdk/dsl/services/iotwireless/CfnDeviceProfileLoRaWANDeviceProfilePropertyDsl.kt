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

  /**
   * @param classBTimeout The ClassBTimeout value.
   */
  public fun classBTimeout(classBTimeout: Number) {
    cdkBuilder.classBTimeout(classBTimeout)
  }

  /**
   * @param classCTimeout The ClassCTimeout value.
   */
  public fun classCTimeout(classCTimeout: Number) {
    cdkBuilder.classCTimeout(classCTimeout)
  }

  /**
   * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
   * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
   */
  public fun factoryPresetFreqsList(vararg factoryPresetFreqsList: Number) {
    _factoryPresetFreqsList.addAll(listOf(*factoryPresetFreqsList))
  }

  /**
   * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
   * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
   */
  public fun factoryPresetFreqsList(factoryPresetFreqsList: Collection<Number>) {
    _factoryPresetFreqsList.addAll(factoryPresetFreqsList)
  }

  /**
   * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
   * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
   */
  public fun factoryPresetFreqsList(factoryPresetFreqsList: IResolvable) {
    cdkBuilder.factoryPresetFreqsList(factoryPresetFreqsList)
  }

  /**
   * @param macVersion The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device
   * profile.
   */
  public fun macVersion(macVersion: String) {
    cdkBuilder.macVersion(macVersion)
  }

  /**
   * @param maxDutyCycle The MaxDutyCycle value.
   */
  public fun maxDutyCycle(maxDutyCycle: Number) {
    cdkBuilder.maxDutyCycle(maxDutyCycle)
  }

  /**
   * @param maxEirp The MaxEIRP value.
   */
  public fun maxEirp(maxEirp: Number) {
    cdkBuilder.maxEirp(maxEirp)
  }

  /**
   * @param pingSlotDr The PingSlotDR value.
   */
  public fun pingSlotDr(pingSlotDr: Number) {
    cdkBuilder.pingSlotDr(pingSlotDr)
  }

  /**
   * @param pingSlotFreq The PingSlotFreq value.
   */
  public fun pingSlotFreq(pingSlotFreq: Number) {
    cdkBuilder.pingSlotFreq(pingSlotFreq)
  }

  /**
   * @param pingSlotPeriod The PingSlotPeriod value.
   */
  public fun pingSlotPeriod(pingSlotPeriod: Number) {
    cdkBuilder.pingSlotPeriod(pingSlotPeriod)
  }

  /**
   * @param regParamsRevision The version of regional parameters.
   */
  public fun regParamsRevision(regParamsRevision: String) {
    cdkBuilder.regParamsRevision(regParamsRevision)
  }

  /**
   * @param rfRegion The frequency band (RFRegion) value.
   */
  public fun rfRegion(rfRegion: String) {
    cdkBuilder.rfRegion(rfRegion)
  }

  /**
   * @param rxDataRate2 The RXDataRate2 value.
   */
  public fun rxDataRate2(rxDataRate2: Number) {
    cdkBuilder.rxDataRate2(rxDataRate2)
  }

  /**
   * @param rxDelay1 The RXDelay1 value.
   */
  public fun rxDelay1(rxDelay1: Number) {
    cdkBuilder.rxDelay1(rxDelay1)
  }

  /**
   * @param rxDrOffset1 The RXDROffset1 value.
   */
  public fun rxDrOffset1(rxDrOffset1: Number) {
    cdkBuilder.rxDrOffset1(rxDrOffset1)
  }

  /**
   * @param rxFreq2 The RXFreq2 value.
   */
  public fun rxFreq2(rxFreq2: Number) {
    cdkBuilder.rxFreq2(rxFreq2)
  }

  /**
   * @param supports32BitFCnt The Supports32BitFCnt value.
   */
  public fun supports32BitFCnt(supports32BitFCnt: Boolean) {
    cdkBuilder.supports32BitFCnt(supports32BitFCnt)
  }

  /**
   * @param supports32BitFCnt The Supports32BitFCnt value.
   */
  public fun supports32BitFCnt(supports32BitFCnt: IResolvable) {
    cdkBuilder.supports32BitFCnt(supports32BitFCnt)
  }

  /**
   * @param supportsClassB The SupportsClassB value.
   */
  public fun supportsClassB(supportsClassB: Boolean) {
    cdkBuilder.supportsClassB(supportsClassB)
  }

  /**
   * @param supportsClassB The SupportsClassB value.
   */
  public fun supportsClassB(supportsClassB: IResolvable) {
    cdkBuilder.supportsClassB(supportsClassB)
  }

  /**
   * @param supportsClassC The SupportsClassC value.
   */
  public fun supportsClassC(supportsClassC: Boolean) {
    cdkBuilder.supportsClassC(supportsClassC)
  }

  /**
   * @param supportsClassC The SupportsClassC value.
   */
  public fun supportsClassC(supportsClassC: IResolvable) {
    cdkBuilder.supportsClassC(supportsClassC)
  }

  /**
   * @param supportsJoin The SupportsJoin value.
   */
  public fun supportsJoin(supportsJoin: Boolean) {
    cdkBuilder.supportsJoin(supportsJoin)
  }

  /**
   * @param supportsJoin The SupportsJoin value.
   */
  public fun supportsJoin(supportsJoin: IResolvable) {
    cdkBuilder.supportsJoin(supportsJoin)
  }

  public fun build(): CfnDeviceProfile.LoRaWANDeviceProfileProperty {
    if(_factoryPresetFreqsList.isNotEmpty())
        cdkBuilder.factoryPresetFreqsList(_factoryPresetFreqsList)
    return cdkBuilder.build()
  }
}
