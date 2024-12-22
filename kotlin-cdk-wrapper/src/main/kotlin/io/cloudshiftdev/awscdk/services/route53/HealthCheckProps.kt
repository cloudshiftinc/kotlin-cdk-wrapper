@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a new health check.
 *
 * Example:
 *
 * ```
 * HostedZone myZone;
 * HealthCheck healthCheck = HealthCheck.Builder.create(this, "HealthCheck")
 * .type(HealthCheckType.HTTP)
 * .fqdn("example.com")
 * .port(80)
 * .resourcePath("/health")
 * .failureThreshold(3)
 * .requestInterval(Duration.seconds(30))
 * .build();
 * ARecord.Builder.create(this, "ARecord")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses("1.2.3.4"))
 * .healthCheck(healthCheck)
 * .weight(100)
 * .build();
 * ARecord.Builder.create(this, "ARecord2")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses("5.6.7.8"))
 * .weight(0)
 * .build();
 * ```
 */
public interface HealthCheckProps {
  /**
   * CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the
   * specified health check is healthy.
   *
   * Default: - if the type is CLOUDWATCH_METRIC, this property is required. Otherwise, it is not
   * configured.
   */
  public fun alarmIdentifier(): AlarmIdentifier? =
      unwrap(this).getAlarmIdentifier()?.let(AlarmIdentifier::wrap)

  /**
   * A list of health checks to monitor for this 'CALCULATED' health check.
   *
   * Default: - if the type is CALCULATED, this property is required. Otherwise, it is not
   * configured.
   */
  public fun childHealthChecks(): List<IHealthCheck> =
      unwrap(this).getChildHealthChecks()?.map(IHealthCheck::wrap) ?: emptyList()

  /**
   * Specify whether you want Amazon Route 53 to send the value of FullyQualifiedDomainName to the
   * endpoint in the client_hello message during TLS negotiation.
   *
   * This allows the endpoint to respond to HTTPS health check requests with the applicable SSL/TLS
   * certificate.
   *
   * Default: - if the type is HTTPS or HTTPS_STR_MATCH, this property default value is true.
   * Otherwise, it is not configured.
   */
  public fun enableSNI(): Boolean? = unwrap(this).getEnableSNI()

  /**
   * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53
   * to change the current status of the endpoint from unhealthy to healthy or vice versa.
   *
   * Default: - if the type is CALCULATED it's not configured
   * - if the type is CLOUDWATCH_METRIC it's not configured
   * - otherwise, the default value is 3.
   */
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  /**
   * Fully qualified domain name of the endpoint to be checked.
   *
   * Amazon Route 53 behavior depends on whether you specify a value for IPAddress.
   *
   * If you specify a value for IPAddress:
   *
   * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes
   * the value of FullyQualifiedDomainName in the Host header for all health checks except TCP health
   * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53
   * to perform health checks.
   * Note: If you specify a value for Port property other than 80 or 443, Route 53 will constract
   * the value for Host header as FullyQualifiedDomainName:Port.
   *
   * If you don't specify a value for IPAddress:
   *
   * Route 53 sends a DNS request to the domain that you specify for FullyQualifiedDomainName at the
   * interval that you specify for RequestInterval. Using an IPv4 address that DNS returns, Route 53
   * then checks the health of the endpoint.
   *
   * Additionally, if the type of the health check is HTTP, HTTPS, HTTP_STR_MATCH, or
   * HTTPS_STR_MATCH, Route 53 passes the value of FullyQualifiedDomainName in the Host header, as it
   * does when you specify value for IPAddress. If the type is TCP, Route 53 doesn't pass a Host
   * header.
   *
   * Default: - not configured
   */
  public fun fqdn(): String? = unwrap(this).getFqdn()

  /**
   * The number of child health checks that are associated with a CALCULATED health that Amazon
   * Route 53 must consider healthy for the CALCULATED health check to be considered healthy.
   *
   * Default: - if the type is CALCULATED, the default value is number of child health checks.
   * Otherwise, it is not configured.
   */
  public fun healthThreshold(): Number? = unwrap(this).getHealthThreshold()

  /**
   * The status of the health check when CloudWatch has insufficient data about the state of
   * associated alarm.
   *
   * Default: - if the type is CLOUDWATCH_METRIC, the default value is
   * InsufficientDataHealthStatus.LAST_KNOWN_STATUS. Otherwise, it is not configured.
   */
  public fun insufficientDataHealthStatus(): InsufficientDataHealthStatusEnum? =
      unwrap(this).getInsufficientDataHealthStatus()?.let(InsufficientDataHealthStatusEnum::wrap)

  /**
   * Specify whether you want Amazon Route 53 to invert the status of a health check, so a health
   * check that would normally be considered unhealthy is considered healthy, and vice versa.
   *
   * Default: false
   */
  public fun inverted(): Boolean? = unwrap(this).getInverted()

  /**
   * The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health
   * checks on.
   *
   * If you don't specify a value for IPAddress, Route 53 sends a DNS request to resolve the domain
   * name that you specify in FullyQualifiedDomainName at the interval that you specify in
   * RequestInterval. Using an IPv4 address that DNS returns, Route 53 then checks the health of the
   * endpoint.
   *
   * Default: - not configured
   */
  public fun ipAddress(): String? = unwrap(this).getIpAddress()

  /**
   * Specify whether you want Amazon Route 53 to measure the latency between health checkers in
   * multiple AWS regions and your endpoint, and to display CloudWatch latency graphs on the Health
   * Checks page in the Route 53 console.
   *
   * Default: - if the type is CALCULATED it's not configured
   * - if the type is CLOUDWATCH_METRIC it's not configured
   * - otherwise, the default value is false.
   */
  public fun measureLatency(): Boolean? = unwrap(this).getMeasureLatency()

  /**
   * The port on the endpoint that you want Amazon Route 53 to perform health checks on.
   *
   * Default: - if the type is HTTP or HTTP_STR_MATCH, the default value is 80.
   * - if the type is HTTPS or HTTPS_STR_MATCH, the default value is 443.
   * - otherwise, it is not configured.
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * An array of region identifiers that you want Amazon Route 53 health checkers to check the
   * health of the endpoint from.
   *
   * Please refer to the CloudFormation documentation for the most up-to-date list of regions.
   *
   * Default: - if the type is CALCULATED, CLOUDWATCH_METRIC, or RECOVERY_CONTROL, this property is
   * not configured.
   * - otherwise, the default value will be set by CloudFormation itself and will include all valid
   * regions. Please refer to the CloudFormation documentation for the most up-to-date list of regions.
   *
   * [Documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
   */
  public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

  /**
   * The duration between the time that Amazon Route 53 gets a response from your endpoint and the
   * time that it sends the next health check request.
   *
   * Each Route 53 health checker makes requests at this interval.
   *
   * Default: - if the type is CALCULATED it's not configured
   * - if the type is CLOUDWATCH_METRIC it's not configured
   * - otherwise, the default value is 30 seconds.
   */
  public fun requestInterval(): Duration? = unwrap(this).getRequestInterval()?.let(Duration::wrap)

  /**
   * The path that you want Amazon Route 53 to request when performing health checks.
   *
   * The path can be any value for which your endpoint will return an HTTP status code of 2xx or 3xx
   * when the endpoint is healthy, for example the file /docs/route53-health-check.html. Route 53
   * automatically adds the DNS name for the service and a leading forward slash (/) character.
   *
   * Default: - if the type is HTTP, HTTPS, HTTP_STR_MATCH, or HTTPS_STR_MATCH, the default value is
   * empty string.
   * - otherwise, it is not configured.
   */
  public fun resourcePath(): String? = unwrap(this).getResourcePath()

  /**
   * The Amazon Resource Name (ARN) of the Route 53 Application Recovery Controller routing control
   * that you want Amazon Route 53 health checkers to use to determine whether the specified health
   * check is healthy.
   *
   * Default: - if the type is RECOVERY_CONTROL, this property is required. Otherwise, it is not
   * configured.
   */
  public fun routingControl(): String? = unwrap(this).getRoutingControl()

  /**
   * The string that you want Amazon Route 53 to search for in the response body from the specified
   * resource.
   *
   * If the string appears in the response body, Route 53 considers the resource healthy.
   *
   * Route 53 considers case when searching for SearchString in the response body.
   *
   * Default: - if the type is HTTP_STR_MATCH or HTTPS_STR_MATCH, this property is required.
   * Otherwise, it is not configured.
   */
  public fun searchString(): String? = unwrap(this).getSearchString()

  /**
   * The type of health check to be associated with the record.
   */
  public fun type(): HealthCheckType

  /**
   * A builder for [HealthCheckProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarmIdentifier CloudWatch alarm that you want Amazon Route 53 health checkers to use
     * to determine whether the specified health check is healthy.
     */
    public fun alarmIdentifier(alarmIdentifier: AlarmIdentifier)

    /**
     * @param alarmIdentifier CloudWatch alarm that you want Amazon Route 53 health checkers to use
     * to determine whether the specified health check is healthy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ba522141aaf2513bcf0f2f11ee82784b99ebcc2a1cebe0642120c76db526123")
    public fun alarmIdentifier(alarmIdentifier: AlarmIdentifier.Builder.() -> Unit)

    /**
     * @param childHealthChecks A list of health checks to monitor for this 'CALCULATED' health
     * check.
     */
    public fun childHealthChecks(childHealthChecks: List<IHealthCheck>)

    /**
     * @param childHealthChecks A list of health checks to monitor for this 'CALCULATED' health
     * check.
     */
    public fun childHealthChecks(vararg childHealthChecks: IHealthCheck)

    /**
     * @param enableSni Specify whether you want Amazon Route 53 to send the value of
     * FullyQualifiedDomainName to the endpoint in the client_hello message during TLS negotiation.
     * This allows the endpoint to respond to HTTPS health check requests with the applicable
     * SSL/TLS certificate.
     */
    public fun enableSni(enableSni: Boolean)

    /**
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint from unhealthy to healthy
     * or vice versa.
     */
    public fun failureThreshold(failureThreshold: Number)

    /**
     * @param fqdn Fully qualified domain name of the endpoint to be checked.
     * Amazon Route 53 behavior depends on whether you specify a value for IPAddress.
     *
     * If you specify a value for IPAddress:
     *
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes
     * the value of FullyQualifiedDomainName in the Host header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route
     * 53 to perform health checks.
     * Note: If you specify a value for Port property other than 80 or 443, Route 53 will constract
     * the value for Host header as FullyQualifiedDomainName:Port.
     *
     * If you don't specify a value for IPAddress:
     *
     * Route 53 sends a DNS request to the domain that you specify for FullyQualifiedDomainName at
     * the interval that you specify for RequestInterval. Using an IPv4 address that DNS returns, Route
     * 53 then checks the health of the endpoint.
     *
     * Additionally, if the type of the health check is HTTP, HTTPS, HTTP_STR_MATCH, or
     * HTTPS_STR_MATCH, Route 53 passes the value of FullyQualifiedDomainName in the Host header, as it
     * does when you specify value for IPAddress. If the type is TCP, Route 53 doesn't pass a Host
     * header.
     */
    public fun fqdn(fqdn: String)

    /**
     * @param healthThreshold The number of child health checks that are associated with a
     * CALCULATED health that Amazon Route 53 must consider healthy for the CALCULATED health check to
     * be considered healthy.
     */
    public fun healthThreshold(healthThreshold: Number)

    /**
     * @param insufficientDataHealthStatus The status of the health check when CloudWatch has
     * insufficient data about the state of associated alarm.
     */
    public
        fun insufficientDataHealthStatus(insufficientDataHealthStatus: InsufficientDataHealthStatusEnum)

    /**
     * @param inverted Specify whether you want Amazon Route 53 to invert the status of a health
     * check, so a health check that would normally be considered unhealthy is considered healthy, and
     * vice versa.
     */
    public fun inverted(inverted: Boolean)

    /**
     * @param ipAddress The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53
     * to perform health checks on.
     * If you don't specify a value for IPAddress, Route 53 sends a DNS request to resolve the
     * domain name that you specify in FullyQualifiedDomainName at the interval that you specify in
     * RequestInterval. Using an IPv4 address that DNS returns, Route 53 then checks the health of the
     * endpoint.
     */
    public fun ipAddress(ipAddress: String)

    /**
     * @param measureLatency Specify whether you want Amazon Route 53 to measure the latency between
     * health checkers in multiple AWS regions and your endpoint, and to display CloudWatch latency
     * graphs on the Health Checks page in the Route 53 console.
     */
    public fun measureLatency(measureLatency: Boolean)

    /**
     * @param port The port on the endpoint that you want Amazon Route 53 to perform health checks
     * on.
     */
    public fun port(port: Number)

    /**
     * @param regions An array of region identifiers that you want Amazon Route 53 health checkers
     * to check the health of the endpoint from.
     * Please refer to the CloudFormation documentation for the most up-to-date list of regions.
     */
    public fun regions(regions: List<String>)

    /**
     * @param regions An array of region identifiers that you want Amazon Route 53 health checkers
     * to check the health of the endpoint from.
     * Please refer to the CloudFormation documentation for the most up-to-date list of regions.
     */
    public fun regions(vararg regions: String)

    /**
     * @param requestInterval The duration between the time that Amazon Route 53 gets a response
     * from your endpoint and the time that it sends the next health check request.
     * Each Route 53 health checker makes requests at this interval.
     */
    public fun requestInterval(requestInterval: Duration)

    /**
     * @param resourcePath The path that you want Amazon Route 53 to request when performing health
     * checks.
     * The path can be any value for which your endpoint will return an HTTP status code of 2xx or
     * 3xx when the endpoint is healthy, for example the file /docs/route53-health-check.html. Route 53
     * automatically adds the DNS name for the service and a leading forward slash (/) character.
     */
    public fun resourcePath(resourcePath: String)

    /**
     * @param routingControl The Amazon Resource Name (ARN) of the Route 53 Application Recovery
     * Controller routing control that you want Amazon Route 53 health checkers to use to determine
     * whether the specified health check is healthy.
     */
    public fun routingControl(routingControl: String)

    /**
     * @param searchString The string that you want Amazon Route 53 to search for in the response
     * body from the specified resource.
     * If the string appears in the response body, Route 53 considers the resource healthy.
     *
     * Route 53 considers case when searching for SearchString in the response body.
     */
    public fun searchString(searchString: String)

    /**
     * @param type The type of health check to be associated with the record. 
     */
    public fun type(type: HealthCheckType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.HealthCheckProps.Builder =
        software.amazon.awscdk.services.route53.HealthCheckProps.builder()

    /**
     * @param alarmIdentifier CloudWatch alarm that you want Amazon Route 53 health checkers to use
     * to determine whether the specified health check is healthy.
     */
    override fun alarmIdentifier(alarmIdentifier: AlarmIdentifier) {
      cdkBuilder.alarmIdentifier(alarmIdentifier.let(AlarmIdentifier.Companion::unwrap))
    }

    /**
     * @param alarmIdentifier CloudWatch alarm that you want Amazon Route 53 health checkers to use
     * to determine whether the specified health check is healthy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ba522141aaf2513bcf0f2f11ee82784b99ebcc2a1cebe0642120c76db526123")
    override fun alarmIdentifier(alarmIdentifier: AlarmIdentifier.Builder.() -> Unit): Unit =
        alarmIdentifier(AlarmIdentifier(alarmIdentifier))

    /**
     * @param childHealthChecks A list of health checks to monitor for this 'CALCULATED' health
     * check.
     */
    override fun childHealthChecks(childHealthChecks: List<IHealthCheck>) {
      cdkBuilder.childHealthChecks(childHealthChecks.map(IHealthCheck.Companion::unwrap))
    }

    /**
     * @param childHealthChecks A list of health checks to monitor for this 'CALCULATED' health
     * check.
     */
    override fun childHealthChecks(vararg childHealthChecks: IHealthCheck): Unit =
        childHealthChecks(childHealthChecks.toList())

    /**
     * @param enableSni Specify whether you want Amazon Route 53 to send the value of
     * FullyQualifiedDomainName to the endpoint in the client_hello message during TLS negotiation.
     * This allows the endpoint to respond to HTTPS health check requests with the applicable
     * SSL/TLS certificate.
     */
    override fun enableSni(enableSni: Boolean) {
      cdkBuilder.enableSni(enableSni)
    }

    /**
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint from unhealthy to healthy
     * or vice versa.
     */
    override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    /**
     * @param fqdn Fully qualified domain name of the endpoint to be checked.
     * Amazon Route 53 behavior depends on whether you specify a value for IPAddress.
     *
     * If you specify a value for IPAddress:
     *
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes
     * the value of FullyQualifiedDomainName in the Host header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route
     * 53 to perform health checks.
     * Note: If you specify a value for Port property other than 80 or 443, Route 53 will constract
     * the value for Host header as FullyQualifiedDomainName:Port.
     *
     * If you don't specify a value for IPAddress:
     *
     * Route 53 sends a DNS request to the domain that you specify for FullyQualifiedDomainName at
     * the interval that you specify for RequestInterval. Using an IPv4 address that DNS returns, Route
     * 53 then checks the health of the endpoint.
     *
     * Additionally, if the type of the health check is HTTP, HTTPS, HTTP_STR_MATCH, or
     * HTTPS_STR_MATCH, Route 53 passes the value of FullyQualifiedDomainName in the Host header, as it
     * does when you specify value for IPAddress. If the type is TCP, Route 53 doesn't pass a Host
     * header.
     */
    override fun fqdn(fqdn: String) {
      cdkBuilder.fqdn(fqdn)
    }

    /**
     * @param healthThreshold The number of child health checks that are associated with a
     * CALCULATED health that Amazon Route 53 must consider healthy for the CALCULATED health check to
     * be considered healthy.
     */
    override fun healthThreshold(healthThreshold: Number) {
      cdkBuilder.healthThreshold(healthThreshold)
    }

    /**
     * @param insufficientDataHealthStatus The status of the health check when CloudWatch has
     * insufficient data about the state of associated alarm.
     */
    override
        fun insufficientDataHealthStatus(insufficientDataHealthStatus: InsufficientDataHealthStatusEnum) {
      cdkBuilder.insufficientDataHealthStatus(insufficientDataHealthStatus.let(InsufficientDataHealthStatusEnum.Companion::unwrap))
    }

    /**
     * @param inverted Specify whether you want Amazon Route 53 to invert the status of a health
     * check, so a health check that would normally be considered unhealthy is considered healthy, and
     * vice versa.
     */
    override fun inverted(inverted: Boolean) {
      cdkBuilder.inverted(inverted)
    }

    /**
     * @param ipAddress The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53
     * to perform health checks on.
     * If you don't specify a value for IPAddress, Route 53 sends a DNS request to resolve the
     * domain name that you specify in FullyQualifiedDomainName at the interval that you specify in
     * RequestInterval. Using an IPv4 address that DNS returns, Route 53 then checks the health of the
     * endpoint.
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * @param measureLatency Specify whether you want Amazon Route 53 to measure the latency between
     * health checkers in multiple AWS regions and your endpoint, and to display CloudWatch latency
     * graphs on the Health Checks page in the Route 53 console.
     */
    override fun measureLatency(measureLatency: Boolean) {
      cdkBuilder.measureLatency(measureLatency)
    }

    /**
     * @param port The port on the endpoint that you want Amazon Route 53 to perform health checks
     * on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param regions An array of region identifiers that you want Amazon Route 53 health checkers
     * to check the health of the endpoint from.
     * Please refer to the CloudFormation documentation for the most up-to-date list of regions.
     */
    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    /**
     * @param regions An array of region identifiers that you want Amazon Route 53 health checkers
     * to check the health of the endpoint from.
     * Please refer to the CloudFormation documentation for the most up-to-date list of regions.
     */
    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    /**
     * @param requestInterval The duration between the time that Amazon Route 53 gets a response
     * from your endpoint and the time that it sends the next health check request.
     * Each Route 53 health checker makes requests at this interval.
     */
    override fun requestInterval(requestInterval: Duration) {
      cdkBuilder.requestInterval(requestInterval.let(Duration.Companion::unwrap))
    }

    /**
     * @param resourcePath The path that you want Amazon Route 53 to request when performing health
     * checks.
     * The path can be any value for which your endpoint will return an HTTP status code of 2xx or
     * 3xx when the endpoint is healthy, for example the file /docs/route53-health-check.html. Route 53
     * automatically adds the DNS name for the service and a leading forward slash (/) character.
     */
    override fun resourcePath(resourcePath: String) {
      cdkBuilder.resourcePath(resourcePath)
    }

    /**
     * @param routingControl The Amazon Resource Name (ARN) of the Route 53 Application Recovery
     * Controller routing control that you want Amazon Route 53 health checkers to use to determine
     * whether the specified health check is healthy.
     */
    override fun routingControl(routingControl: String) {
      cdkBuilder.routingControl(routingControl)
    }

    /**
     * @param searchString The string that you want Amazon Route 53 to search for in the response
     * body from the specified resource.
     * If the string appears in the response body, Route 53 considers the resource healthy.
     *
     * Route 53 considers case when searching for SearchString in the response body.
     */
    override fun searchString(searchString: String) {
      cdkBuilder.searchString(searchString)
    }

    /**
     * @param type The type of health check to be associated with the record. 
     */
    override fun type(type: HealthCheckType) {
      cdkBuilder.type(type.let(HealthCheckType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.HealthCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.HealthCheckProps,
  ) : CdkObject(cdkObject),
      HealthCheckProps {
    /**
     * CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether
     * the specified health check is healthy.
     *
     * Default: - if the type is CLOUDWATCH_METRIC, this property is required. Otherwise, it is not
     * configured.
     */
    override fun alarmIdentifier(): AlarmIdentifier? =
        unwrap(this).getAlarmIdentifier()?.let(AlarmIdentifier::wrap)

    /**
     * A list of health checks to monitor for this 'CALCULATED' health check.
     *
     * Default: - if the type is CALCULATED, this property is required. Otherwise, it is not
     * configured.
     */
    override fun childHealthChecks(): List<IHealthCheck> =
        unwrap(this).getChildHealthChecks()?.map(IHealthCheck::wrap) ?: emptyList()

    /**
     * Specify whether you want Amazon Route 53 to send the value of FullyQualifiedDomainName to the
     * endpoint in the client_hello message during TLS negotiation.
     *
     * This allows the endpoint to respond to HTTPS health check requests with the applicable
     * SSL/TLS certificate.
     *
     * Default: - if the type is HTTPS or HTTPS_STR_MATCH, this property default value is true.
     * Otherwise, it is not configured.
     */
    override fun enableSNI(): Boolean? = unwrap(this).getEnableSNI()

    /**
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route
     * 53 to change the current status of the endpoint from unhealthy to healthy or vice versa.
     *
     * Default: - if the type is CALCULATED it's not configured
     * - if the type is CLOUDWATCH_METRIC it's not configured
     * - otherwise, the default value is 3.
     */
    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    /**
     * Fully qualified domain name of the endpoint to be checked.
     *
     * Amazon Route 53 behavior depends on whether you specify a value for IPAddress.
     *
     * If you specify a value for IPAddress:
     *
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes
     * the value of FullyQualifiedDomainName in the Host header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route
     * 53 to perform health checks.
     * Note: If you specify a value for Port property other than 80 or 443, Route 53 will constract
     * the value for Host header as FullyQualifiedDomainName:Port.
     *
     * If you don't specify a value for IPAddress:
     *
     * Route 53 sends a DNS request to the domain that you specify for FullyQualifiedDomainName at
     * the interval that you specify for RequestInterval. Using an IPv4 address that DNS returns, Route
     * 53 then checks the health of the endpoint.
     *
     * Additionally, if the type of the health check is HTTP, HTTPS, HTTP_STR_MATCH, or
     * HTTPS_STR_MATCH, Route 53 passes the value of FullyQualifiedDomainName in the Host header, as it
     * does when you specify value for IPAddress. If the type is TCP, Route 53 doesn't pass a Host
     * header.
     *
     * Default: - not configured
     */
    override fun fqdn(): String? = unwrap(this).getFqdn()

    /**
     * The number of child health checks that are associated with a CALCULATED health that Amazon
     * Route 53 must consider healthy for the CALCULATED health check to be considered healthy.
     *
     * Default: - if the type is CALCULATED, the default value is number of child health checks.
     * Otherwise, it is not configured.
     */
    override fun healthThreshold(): Number? = unwrap(this).getHealthThreshold()

    /**
     * The status of the health check when CloudWatch has insufficient data about the state of
     * associated alarm.
     *
     * Default: - if the type is CLOUDWATCH_METRIC, the default value is
     * InsufficientDataHealthStatus.LAST_KNOWN_STATUS. Otherwise, it is not configured.
     */
    override fun insufficientDataHealthStatus(): InsufficientDataHealthStatusEnum? =
        unwrap(this).getInsufficientDataHealthStatus()?.let(InsufficientDataHealthStatusEnum::wrap)

    /**
     * Specify whether you want Amazon Route 53 to invert the status of a health check, so a health
     * check that would normally be considered unhealthy is considered healthy, and vice versa.
     *
     * Default: false
     */
    override fun inverted(): Boolean? = unwrap(this).getInverted()

    /**
     * The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health
     * checks on.
     *
     * If you don't specify a value for IPAddress, Route 53 sends a DNS request to resolve the
     * domain name that you specify in FullyQualifiedDomainName at the interval that you specify in
     * RequestInterval. Using an IPv4 address that DNS returns, Route 53 then checks the health of the
     * endpoint.
     *
     * Default: - not configured
     */
    override fun ipAddress(): String? = unwrap(this).getIpAddress()

    /**
     * Specify whether you want Amazon Route 53 to measure the latency between health checkers in
     * multiple AWS regions and your endpoint, and to display CloudWatch latency graphs on the Health
     * Checks page in the Route 53 console.
     *
     * Default: - if the type is CALCULATED it's not configured
     * - if the type is CLOUDWATCH_METRIC it's not configured
     * - otherwise, the default value is false.
     */
    override fun measureLatency(): Boolean? = unwrap(this).getMeasureLatency()

    /**
     * The port on the endpoint that you want Amazon Route 53 to perform health checks on.
     *
     * Default: - if the type is HTTP or HTTP_STR_MATCH, the default value is 80.
     * - if the type is HTTPS or HTTPS_STR_MATCH, the default value is 443.
     * - otherwise, it is not configured.
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * An array of region identifiers that you want Amazon Route 53 health checkers to check the
     * health of the endpoint from.
     *
     * Please refer to the CloudFormation documentation for the most up-to-date list of regions.
     *
     * Default: - if the type is CALCULATED, CLOUDWATCH_METRIC, or RECOVERY_CONTROL, this property
     * is not configured.
     * - otherwise, the default value will be set by CloudFormation itself and will include all
     * valid regions. Please refer to the CloudFormation documentation for the most up-to-date list of
     * regions.
     *
     * [Documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html)
     */
    override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    /**
     * The duration between the time that Amazon Route 53 gets a response from your endpoint and the
     * time that it sends the next health check request.
     *
     * Each Route 53 health checker makes requests at this interval.
     *
     * Default: - if the type is CALCULATED it's not configured
     * - if the type is CLOUDWATCH_METRIC it's not configured
     * - otherwise, the default value is 30 seconds.
     */
    override fun requestInterval(): Duration? =
        unwrap(this).getRequestInterval()?.let(Duration::wrap)

    /**
     * The path that you want Amazon Route 53 to request when performing health checks.
     *
     * The path can be any value for which your endpoint will return an HTTP status code of 2xx or
     * 3xx when the endpoint is healthy, for example the file /docs/route53-health-check.html. Route 53
     * automatically adds the DNS name for the service and a leading forward slash (/) character.
     *
     * Default: - if the type is HTTP, HTTPS, HTTP_STR_MATCH, or HTTPS_STR_MATCH, the default value
     * is empty string.
     * - otherwise, it is not configured.
     */
    override fun resourcePath(): String? = unwrap(this).getResourcePath()

    /**
     * The Amazon Resource Name (ARN) of the Route 53 Application Recovery Controller routing
     * control that you want Amazon Route 53 health checkers to use to determine whether the specified
     * health check is healthy.
     *
     * Default: - if the type is RECOVERY_CONTROL, this property is required. Otherwise, it is not
     * configured.
     */
    override fun routingControl(): String? = unwrap(this).getRoutingControl()

    /**
     * The string that you want Amazon Route 53 to search for in the response body from the
     * specified resource.
     *
     * If the string appears in the response body, Route 53 considers the resource healthy.
     *
     * Route 53 considers case when searching for SearchString in the response body.
     *
     * Default: - if the type is HTTP_STR_MATCH or HTTPS_STR_MATCH, this property is required.
     * Otherwise, it is not configured.
     */
    override fun searchString(): String? = unwrap(this).getSearchString()

    /**
     * The type of health check to be associated with the record.
     */
    override fun type(): HealthCheckType = unwrap(this).getType().let(HealthCheckType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HealthCheckProps):
        HealthCheckProps = CdkObjectWrappers.wrap(cdkObject) as? HealthCheckProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckProps):
        software.amazon.awscdk.services.route53.HealthCheckProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.HealthCheckProps
  }
}
