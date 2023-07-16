@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnHealthCheck

@CdkDslMarker
public class CfnHealthCheckHealthCheckConfigPropertyDsl {
  private val cdkBuilder: CfnHealthCheck.HealthCheckConfigProperty.Builder =
      CfnHealthCheck.HealthCheckConfigProperty.builder()

  private val _childHealthChecks: MutableList<String> = mutableListOf()

  private val _regions: MutableList<String> = mutableListOf()

  public fun alarmIdentifier(alarmIdentifier: IResolvable) {
    cdkBuilder.alarmIdentifier(alarmIdentifier)
  }

  public fun alarmIdentifier(alarmIdentifier: CfnHealthCheck.AlarmIdentifierProperty) {
    cdkBuilder.alarmIdentifier(alarmIdentifier)
  }

  public fun childHealthChecks(vararg childHealthChecks: String) {
    _childHealthChecks.addAll(listOf(*childHealthChecks))
  }

  public fun childHealthChecks(childHealthChecks: Collection<String>) {
    _childHealthChecks.addAll(childHealthChecks)
  }

  public fun enableSni(enableSni: Boolean) {
    cdkBuilder.enableSni(enableSni)
  }

  public fun enableSni(enableSni: IResolvable) {
    cdkBuilder.enableSni(enableSni)
  }

  public fun failureThreshold(failureThreshold: Number) {
    cdkBuilder.failureThreshold(failureThreshold)
  }

  public fun fullyQualifiedDomainName(fullyQualifiedDomainName: String) {
    cdkBuilder.fullyQualifiedDomainName(fullyQualifiedDomainName)
  }

  public fun healthThreshold(healthThreshold: Number) {
    cdkBuilder.healthThreshold(healthThreshold)
  }

  public fun insufficientDataHealthStatus(insufficientDataHealthStatus: String) {
    cdkBuilder.insufficientDataHealthStatus(insufficientDataHealthStatus)
  }

  public fun inverted(inverted: Boolean) {
    cdkBuilder.inverted(inverted)
  }

  public fun inverted(inverted: IResolvable) {
    cdkBuilder.inverted(inverted)
  }

  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  public fun measureLatency(measureLatency: Boolean) {
    cdkBuilder.measureLatency(measureLatency)
  }

  public fun measureLatency(measureLatency: IResolvable) {
    cdkBuilder.measureLatency(measureLatency)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun regions(vararg regions: String) {
    _regions.addAll(listOf(*regions))
  }

  public fun regions(regions: Collection<String>) {
    _regions.addAll(regions)
  }

  public fun requestInterval(requestInterval: Number) {
    cdkBuilder.requestInterval(requestInterval)
  }

  public fun resourcePath(resourcePath: String) {
    cdkBuilder.resourcePath(resourcePath)
  }

  public fun routingControlArn(routingControlArn: String) {
    cdkBuilder.routingControlArn(routingControlArn)
  }

  public fun searchString(searchString: String) {
    cdkBuilder.searchString(searchString)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnHealthCheck.HealthCheckConfigProperty {
    if(_childHealthChecks.isNotEmpty()) cdkBuilder.childHealthChecks(_childHealthChecks)
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    return cdkBuilder.build()
  }
}
