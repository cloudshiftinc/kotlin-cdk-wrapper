@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An option group.
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
public open class OptionGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.OptionGroup,
) : Resource(cdkObject), IOptionGroup {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OptionGroupProps,
  ) :
      this(software.amazon.awscdk.services.rds.OptionGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(OptionGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OptionGroupProps.Builder.() -> Unit,
  ) : this(scope, id, OptionGroupProps(props)
  )

  /**
   * Adds a configuration to this OptionGroup.
   *
   * This method is a no-op for an imported OptionGroup.
   *
   * @param configuration 
   */
  public override fun addConfiguration(configuration: OptionConfiguration): Boolean =
      unwrap(this).addConfiguration(configuration.let(OptionConfiguration::unwrap))

  /**
   * Adds a configuration to this OptionGroup.
   *
   * This method is a no-op for an imported OptionGroup.
   *
   * @param configuration 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
  public override fun addConfiguration(configuration: OptionConfiguration.Builder.() -> Unit):
      Boolean = addConfiguration(OptionConfiguration(configuration))

  /**
   * The connections object for the options.
   */
  public open fun optionConnections(): Map<String, Connections> =
      unwrap(this).getOptionConnections().mapValues{Connections.wrap(it.value)}

  /**
   * The name of the option group.
   */
  public override fun optionGroupName(): String = unwrap(this).getOptionGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.OptionGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(configurations: List<OptionConfiguration>)

    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(vararg configurations: OptionConfiguration)

    /**
     * A description of the option group.
     *
     * Default: a CDK generated description
     *
     * @param description A description of the option group. 
     */
    public fun description(description: String)

    /**
     * The database engine that this option group is associated with.
     *
     * @param engine The database engine that this option group is associated with. 
     */
    public fun engine(engine: IInstanceEngine)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionGroup.Builder =
        software.amazon.awscdk.services.rds.OptionGroup.Builder.create(scope, id)

    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(configurations: List<OptionConfiguration>) {
      cdkBuilder.configurations(configurations.map(OptionConfiguration::unwrap))
    }

    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(vararg configurations: OptionConfiguration): Unit =
        configurations(configurations.toList())

    /**
     * A description of the option group.
     *
     * Default: a CDK generated description
     *
     * @param description A description of the option group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The database engine that this option group is associated with.
     *
     * @param engine The database engine that this option group is associated with. 
     */
    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromOptionGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      optionGroupName: String,
    ): IOptionGroup =
        software.amazon.awscdk.services.rds.OptionGroup.fromOptionGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, optionGroupName).let(IOptionGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OptionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OptionGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OptionGroup): OptionGroup =
        OptionGroup(cdkObject)

    internal fun unwrap(wrapped: OptionGroup): software.amazon.awscdk.services.rds.OptionGroup =
        wrapped.cdkObject
  }
}
