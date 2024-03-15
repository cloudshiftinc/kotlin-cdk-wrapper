@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The base class for log drivers.
 *
 * Example:
 *
 * ```
 * Secret secret;
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.splunk(SplunkLogDriverProps.builder()
 * .secretToken(secret)
 * .url("my-splunk-url")
 * .build()))
 * .build());
 * ```
 */
public open class LogDrivers internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.LogDrivers,
) : CdkObject(cdkObject) {
  public companion object {
    public fun awsLogs(props: AwsLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.awsLogs(props.let(AwsLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d0d9a506ce9f0fb5ba45e5e4ad84bbef85836d2019566b9bd522ad46b3e85e")
    public fun awsLogs(props: AwsLogDriverProps.Builder.() -> Unit): LogDriver =
        awsLogs(AwsLogDriverProps(props))

    public fun firelens(props: FireLensLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.firelens(props.let(FireLensLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea9d67b53e8a0d60901e3b4170cb9d382e095b880c4ea01a96e0d533e6fdd7a0")
    public fun firelens(props: FireLensLogDriverProps.Builder.() -> Unit): LogDriver =
        firelens(FireLensLogDriverProps(props))

    public fun fluentd(): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.fluentd().let(LogDriver::wrap)

    public fun fluentd(props: FluentdLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.fluentd(props.let(FluentdLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8616d671e373c5bdce2dab019deebbc53bb86eac8e207423098286d9b70a7b6c")
    public fun fluentd(props: FluentdLogDriverProps.Builder.() -> Unit): LogDriver =
        fluentd(FluentdLogDriverProps(props))

    public fun gelf(props: GelfLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.gelf(props.let(GelfLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffa97fd65e07fe1d06bc0df7726876713aa9de9a360b70160204846fb75de23b")
    public fun gelf(props: GelfLogDriverProps.Builder.() -> Unit): LogDriver =
        gelf(GelfLogDriverProps(props))

    public fun journald(): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.journald().let(LogDriver::wrap)

    public fun journald(props: JournaldLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.journald(props.let(JournaldLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a7e11c719f616a93699b28238d9b097b6707585d0c79c06ef778c997dd8f09d")
    public fun journald(props: JournaldLogDriverProps.Builder.() -> Unit): LogDriver =
        journald(JournaldLogDriverProps(props))

    public fun jsonFile(): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.jsonFile().let(LogDriver::wrap)

    public fun jsonFile(props: JsonFileLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.jsonFile(props.let(JsonFileLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f1f4f250701846f5bbf1cce43fd57e1529d32914a13689354fe6c3523a6831b")
    public fun jsonFile(props: JsonFileLogDriverProps.Builder.() -> Unit): LogDriver =
        jsonFile(JsonFileLogDriverProps(props))

    public fun splunk(props: SplunkLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.splunk(props.let(SplunkLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6a7e5f3363d821dc68dbff0ef8a2b674fd4710eeac25860b75abe40b5242341")
    public fun splunk(props: SplunkLogDriverProps.Builder.() -> Unit): LogDriver =
        splunk(SplunkLogDriverProps(props))

    public fun syslog(): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.syslog().let(LogDriver::wrap)

    public fun syslog(props: SyslogLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDrivers.syslog(props.let(SyslogLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7630600838b209f9d5c5d5f0e7a396eac2279f6416b3ce4c8a2aebf37be7a54a")
    public fun syslog(props: SyslogLogDriverProps.Builder.() -> Unit): LogDriver =
        syslog(SyslogLogDriverProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LogDrivers): LogDrivers =
        LogDrivers(cdkObject)

    internal fun unwrap(wrapped: LogDrivers): software.amazon.awscdk.services.ecs.LogDrivers =
        wrapped.cdkObject
  }
}
