@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for an OptionGroup.
 *
 * Example:
 *
 * ```
 * // Set open cursors with parameter group
 * ParameterGroup parameterGroup = ParameterGroup.Builder.create(this, "ParameterGroup")
 * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
 * .parameters(Map.of(
 * "open_cursors", "2500"))
 * .build();
 * OptionGroup optionGroup = OptionGroup.Builder.create(this, "OptionGroup")
 * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
 * .configurations(List.of(OptionConfiguration.builder()
 * .name("LOCATOR")
 * .build(), OptionConfiguration.builder()
 * .name("OEM")
 * .port(1158)
 * .vpc(vpc)
 * .build()))
 * .build();
 * // Allow connections to OEM
 * optionGroup.optionConnections.OEM.connections.allowDefaultPortFromAnyIpv4();
 * // Database instance with production values
 * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
 * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
 * .licenseModel(LicenseModel.BRING_YOUR_OWN_LICENSE)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.MEDIUM))
 * .multiAz(true)
 * .storageType(StorageType.IO1)
 * .credentials(Credentials.fromUsername("syscdk"))
 * .vpc(vpc)
 * .databaseName("ORCL")
 * .storageEncrypted(true)
 * .backupRetention(Duration.days(7))
 * .monitoringInterval(Duration.seconds(60))
 * .enablePerformanceInsights(true)
 * .cloudwatchLogsExports(List.of("trace", "audit", "alert", "listener"))
 * .cloudwatchLogsRetention(RetentionDays.ONE_MONTH)
 * .autoMinorVersionUpgrade(true) // required to be true if LOCATOR is used in the option group
 * .optionGroup(optionGroup)
 * .parameterGroup(parameterGroup)
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * // Allow connections on default port from any IPV4
 * instance.connections.allowDefaultPortFromAnyIpv4();
 * // Rotate the master user password every 30 days
 * instance.addRotationSingleUser();
 * // Add alarm for high CPU
 * // Add alarm for high CPU
 * Alarm.Builder.create(this, "HighCPU")
 * .metric(instance.metricCPUUtilization())
 * .threshold(90)
 * .evaluationPeriods(1)
 * .build();
 * // Trigger Lambda function on instance availability events
 * Function fn = Function.Builder.create(this, "Function")
 * .code(Code.fromInline("exports.handler = (event) =&gt; console.log(event);"))
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_18_X)
 * .build();
 * Rule availabilityRule = instance.onEvent("Availability", OnEventOptions.builder().target(new
 * LambdaFunction(fn)).build());
 * availabilityRule.addEventPattern(EventPattern.builder()
 * .detail(Map.of(
 * "EventCategories", List.of("availability")))
 * .build());
 * ```
 */
public interface OptionGroupProps {
  /**
   * The configurations for this option group.
   */
  public fun configurations(): List<OptionConfiguration>

  /**
   * A description of the option group.
   *
   * Default: a CDK generated description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The database engine that this option group is associated with.
   */
  public fun engine(): IInstanceEngine

  /**
   * A builder for [OptionGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(configurations: List<OptionConfiguration>)

    /**
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(vararg configurations: OptionConfiguration)

    /**
     * @param description A description of the option group.
     */
    public fun description(description: String)

    /**
     * @param engine The database engine that this option group is associated with. 
     */
    public fun engine(engine: IInstanceEngine)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionGroupProps.Builder =
        software.amazon.awscdk.services.rds.OptionGroupProps.builder()

    /**
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(configurations: List<OptionConfiguration>) {
      cdkBuilder.configurations(configurations.map(OptionConfiguration::unwrap))
    }

    /**
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(vararg configurations: OptionConfiguration): Unit =
        configurations(configurations.toList())

    /**
     * @param description A description of the option group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine The database engine that this option group is associated with. 
     */
    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.OptionGroupProps,
  ) : CdkObject(cdkObject), OptionGroupProps {
    /**
     * The configurations for this option group.
     */
    override fun configurations(): List<OptionConfiguration> =
        unwrap(this).getConfigurations().map(OptionConfiguration::wrap)

    /**
     * A description of the option group.
     *
     * Default: a CDK generated description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The database engine that this option group is associated with.
     */
    override fun engine(): IInstanceEngine = unwrap(this).getEngine().let(IInstanceEngine::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OptionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OptionGroupProps):
        OptionGroupProps = CdkObjectWrappers.wrap(cdkObject) as? OptionGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OptionGroupProps):
        software.amazon.awscdk.services.rds.OptionGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.OptionGroupProps
  }
}
