@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.IInstanceEngine
import software.amazon.awscdk.services.rds.OptionConfiguration
import software.amazon.awscdk.services.rds.OptionGroupProps

/**
 * Construction properties for an OptionGroup.
 *
 * Example:
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
 * .runtime(Runtime.NODEJS_14_X)
 * .build();
 * Rule availabilityRule = instance.onEvent("Availability", OnEventOptions.builder().target(new
 * LambdaFunction(fn)).build());
 * availabilityRule.addEventPattern(EventPattern.builder()
 * .detail(Map.of(
 * "EventCategories", List.of("availability")))
 * .build());
 * ```
 */
@CdkDslMarker
public class OptionGroupPropsDsl {
    private val cdkBuilder: OptionGroupProps.Builder = OptionGroupProps.builder()

    private val _configurations: MutableList<OptionConfiguration> = mutableListOf()

    /** @param configurations The configurations for this option group. */
    public fun configurations(configurations: OptionConfigurationDsl.() -> Unit) {
        _configurations.add(OptionConfigurationDsl().apply(configurations).build())
    }

    /** @param configurations The configurations for this option group. */
    public fun configurations(configurations: Collection<OptionConfiguration>) {
        _configurations.addAll(configurations)
    }

    /** @param description A description of the option group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param engine The database engine that this option group is associated with. */
    public fun engine(engine: IInstanceEngine) {
        cdkBuilder.engine(engine)
    }

    public fun build(): OptionGroupProps {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
