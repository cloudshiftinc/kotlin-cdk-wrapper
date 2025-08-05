@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Kinesis Data Analytics application.
 *
 * For information about creating a Kinesis Data Analytics application, see [Creating an
 * Application](https://docs.aws.amazon.com/managed-flink/latest/java/getting-started.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .runtimeEnvironment("runtimeEnvironment")
 * .serviceExecutionRole("serviceExecutionRole")
 * // the properties below are optional
 * .applicationConfiguration(ApplicationConfigurationProperty.builder()
 * .applicationCodeConfiguration(ApplicationCodeConfigurationProperty.builder()
 * .codeContent(CodeContentProperty.builder()
 * .s3ContentLocation(S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .textContent("textContent")
 * .zipFileContent("zipFileContent")
 * .build())
 * .codeContentType("codeContentType")
 * .build())
 * .applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty.builder()
 * .snapshotsEnabled(false)
 * .build())
 * .applicationSystemRollbackConfiguration(ApplicationSystemRollbackConfigurationProperty.builder()
 * .rollbackEnabled(false)
 * .build())
 * .environmentProperties(EnvironmentPropertiesProperty.builder()
 * .propertyGroups(List.of(PropertyGroupProperty.builder()
 * .propertyGroupId("propertyGroupId")
 * .propertyMap(Map.of(
 * "propertyMapKey", "propertyMap"))
 * .build()))
 * .build())
 * .flinkApplicationConfiguration(FlinkApplicationConfigurationProperty.builder()
 * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .checkpointingEnabled(false)
 * .checkpointInterval(123)
 * .minPauseBetweenCheckpoints(123)
 * .build())
 * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .logLevel("logLevel")
 * .metricsLevel("metricsLevel")
 * .build())
 * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .autoScalingEnabled(false)
 * .parallelism(123)
 * .parallelismPerKpu(123)
 * .build())
 * .build())
 * .sqlApplicationConfiguration(SqlApplicationConfigurationProperty.builder()
 * .inputs(List.of(InputProperty.builder()
 * .inputSchema(InputSchemaProperty.builder()
 * .recordColumns(List.of(RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build()))
 * .recordFormat(RecordFormatProperty.builder()
 * .recordFormatType("recordFormatType")
 * // the properties below are optional
 * .mappingParameters(MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .recordEncoding("recordEncoding")
 * .build())
 * .namePrefix("namePrefix")
 * // the properties below are optional
 * .inputParallelism(InputParallelismProperty.builder()
 * .count(123)
 * .build())
 * .inputProcessingConfiguration(InputProcessingConfigurationProperty.builder()
 * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .build())
 * .kinesisFirehoseInput(KinesisFirehoseInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .kinesisStreamsInput(KinesisStreamsInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .build()))
 * .build())
 * .vpcConfigurations(List.of(VpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build()))
 * .zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty.builder()
 * .catalogConfiguration(CatalogConfigurationProperty.builder()
 * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
 * .databaseArn("databaseArn")
 * .build())
 * .build())
 * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
 * .artifactType("artifactType")
 * // the properties below are optional
 * .mavenReference(MavenReferenceProperty.builder()
 * .artifactId("artifactId")
 * .groupId("groupId")
 * .version("version")
 * .build())
 * .s3ContentLocation(S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build()))
 * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
 * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
 * .bucketArn("bucketArn")
 * // the properties below are optional
 * .basePath("basePath")
 * .build())
 * .build())
 * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
 * .logLevel("logLevel")
 * .build())
 * .build())
 * .build())
 * .applicationDescription("applicationDescription")
 * .applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty.builder()
 * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
 * .build())
 * .applicationMode("applicationMode")
 * .applicationName("applicationName")
 * .runConfiguration(RunConfigurationProperty.builder()
 * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
 * .applicationRestoreType("applicationRestoreType")
 * // the properties below are optional
 * .snapshotName("snapshotName")
 * .build())
 * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
 * .allowNonRestoredState(false)
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * Use this parameter to configure the application.
   */
  public open fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

  /**
   * Use this parameter to configure the application.
   */
  public open fun applicationConfiguration(`value`: IResolvable) {
    unwrap(this).setApplicationConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Use this parameter to configure the application.
   */
  public open fun applicationConfiguration(`value`: ApplicationConfigurationProperty) {
    unwrap(this).setApplicationConfiguration(`value`.let(ApplicationConfigurationProperty.Companion::unwrap))
  }

  /**
   * Use this parameter to configure the application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf38b1c68a149f8b996562584d7478f727c22a2fa9f57b29a27968e117594d36")
  public open
      fun applicationConfiguration(`value`: ApplicationConfigurationProperty.Builder.() -> Unit):
      Unit = applicationConfiguration(ApplicationConfigurationProperty(`value`))

  /**
   * The description of the application.
   */
  public open fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  /**
   * The description of the application.
   */
  public open fun applicationDescription(`value`: String) {
    unwrap(this).setApplicationDescription(`value`)
  }

  /**
   * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
   */
  public open fun applicationMaintenanceConfiguration(): Any? =
      unwrap(this).getApplicationMaintenanceConfiguration()

  /**
   * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
   */
  public open fun applicationMaintenanceConfiguration(`value`: IResolvable) {
    unwrap(this).setApplicationMaintenanceConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
   */
  public open
      fun applicationMaintenanceConfiguration(`value`: ApplicationMaintenanceConfigurationProperty) {
    unwrap(this).setApplicationMaintenanceConfiguration(`value`.let(ApplicationMaintenanceConfigurationProperty.Companion::unwrap))
  }

  /**
   * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e69e8eb43d6a1bde05c189122a8f2752de26d99718107069a969f41f25136794")
  public open
      fun applicationMaintenanceConfiguration(`value`: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
      Unit =
      applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty(`value`))

  /**
   * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
   */
  public open fun applicationMode(): String? = unwrap(this).getApplicationMode()

  /**
   * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
   */
  public open fun applicationMode(`value`: String) {
    unwrap(this).setApplicationMode(`value`)
  }

  /**
   * The name of the application.
   */
  public open fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * The name of the application.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Describes the starting parameters for an Managed Service for Apache Flink application.
   */
  public open fun runConfiguration(): Any? = unwrap(this).getRunConfiguration()

  /**
   * Describes the starting parameters for an Managed Service for Apache Flink application.
   */
  public open fun runConfiguration(`value`: IResolvable) {
    unwrap(this).setRunConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes the starting parameters for an Managed Service for Apache Flink application.
   */
  public open fun runConfiguration(`value`: RunConfigurationProperty) {
    unwrap(this).setRunConfiguration(`value`.let(RunConfigurationProperty.Companion::unwrap))
  }

  /**
   * Describes the starting parameters for an Managed Service for Apache Flink application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("57bb5fe3cf9cb0a79aa09d2374de1ed6c30feeaa93bc17b94c7d350140907f23")
  public open fun runConfiguration(`value`: RunConfigurationProperty.Builder.() -> Unit): Unit =
      runConfiguration(RunConfigurationProperty(`value`))

  /**
   * The runtime environment for the application.
   */
  public open fun runtimeEnvironment(): String = unwrap(this).getRuntimeEnvironment()

  /**
   * The runtime environment for the application.
   */
  public open fun runtimeEnvironment(`value`: String) {
    unwrap(this).setRuntimeEnvironment(`value`)
  }

  /**
   * Specifies the IAM role that the application uses to access external resources.
   */
  public open fun serviceExecutionRole(): String = unwrap(this).getServiceExecutionRole()

  /**
   * Specifies the IAM role that the application uses to access external resources.
   */
  public open fun serviceExecutionRole(`value`: String) {
    unwrap(this).setServiceExecutionRole(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of one or more tags to assign to the application.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of one or more tags to assign to the application.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of one or more tags to assign to the application.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Use this parameter to configure the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
     * @param applicationConfiguration Use this parameter to configure the application. 
     */
    public fun applicationConfiguration(applicationConfiguration: IResolvable)

    /**
     * Use this parameter to configure the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
     * @param applicationConfiguration Use this parameter to configure the application. 
     */
    public fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty)

    /**
     * Use this parameter to configure the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
     * @param applicationConfiguration Use this parameter to configure the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f924dbfa45b89be4d341c3cb2e03f5125b1f4e304dbad637c1b36750b8a03b")
    public
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit)

    /**
     * The description of the application.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription)
     * @param applicationDescription The description of the application. 
     */
    public fun applicationDescription(applicationDescription: String)

    /**
     * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
     * @param applicationMaintenanceConfiguration Specifies the maintenance window parameters for a
     * Kinesis Data Analytics application. 
     */
    public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable)

    /**
     * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
     * @param applicationMaintenanceConfiguration Specifies the maintenance window parameters for a
     * Kinesis Data Analytics application. 
     */
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty)

    /**
     * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
     * @param applicationMaintenanceConfiguration Specifies the maintenance window parameters for a
     * Kinesis Data Analytics application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87f70f8e91c7c91340fc3fb505bf1fb12a937ef7e2b6bfeba9e31465fe1a872d")
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit)

    /**
     * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
     *
     * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmode)
     * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set the
     * mode to `INTERACTIVE` . 
     */
    public fun applicationMode(applicationMode: String)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname)
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application. 
     */
    public fun runConfiguration(runConfiguration: IResolvable)

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application. 
     */
    public fun runConfiguration(runConfiguration: RunConfigurationProperty)

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce34f73b60cb5d1d88415697e0cb762020d25f84a270c4f48813f79656d924af")
    public fun runConfiguration(runConfiguration: RunConfigurationProperty.Builder.() -> Unit)

    /**
     * The runtime environment for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment)
     * @param runtimeEnvironment The runtime environment for the application. 
     */
    public fun runtimeEnvironment(runtimeEnvironment: String)

    /**
     * Specifies the IAM role that the application uses to access external resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole)
     * @param serviceExecutionRole Specifies the IAM role that the application uses to access
     * external resources. 
     */
    public fun serviceExecutionRole(serviceExecutionRole: String)

    /**
     * A list of one or more tags to assign to the application.
     *
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
     * @param tags A list of one or more tags to assign to the application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of one or more tags to assign to the application.
     *
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
     * @param tags A list of one or more tags to assign to the application. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.Builder =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.Builder.create(scope, id)

    /**
     * Use this parameter to configure the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
     * @param applicationConfiguration Use this parameter to configure the application. 
     */
    override fun applicationConfiguration(applicationConfiguration: IResolvable) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Use this parameter to configure the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
     * @param applicationConfiguration Use this parameter to configure the application. 
     */
    override
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(ApplicationConfigurationProperty.Companion::unwrap))
    }

    /**
     * Use this parameter to configure the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationconfiguration)
     * @param applicationConfiguration Use this parameter to configure the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f924dbfa45b89be4d341c3cb2e03f5125b1f4e304dbad637c1b36750b8a03b")
    override
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit):
        Unit = applicationConfiguration(ApplicationConfigurationProperty(applicationConfiguration))

    /**
     * The description of the application.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationdescription)
     * @param applicationDescription The description of the application. 
     */
    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    /**
     * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
     * @param applicationMaintenanceConfiguration Specifies the maintenance window parameters for a
     * Kinesis Data Analytics application. 
     */
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
     * @param applicationMaintenanceConfiguration Specifies the maintenance window parameters for a
     * Kinesis Data Analytics application. 
     */
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(ApplicationMaintenanceConfigurationProperty.Companion::unwrap))
    }

    /**
     * Specifies the maintenance window parameters for a Kinesis Data Analytics application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration)
     * @param applicationMaintenanceConfiguration Specifies the maintenance window parameters for a
     * Kinesis Data Analytics application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87f70f8e91c7c91340fc3fb505bf1fb12a937ef7e2b6bfeba9e31465fe1a872d")
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration))

    /**
     * To create a Kinesis Data Analytics Studio notebook, you must set the mode to `INTERACTIVE` .
     *
     * However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationmode)
     * @param applicationMode To create a Kinesis Data Analytics Studio notebook, you must set the
     * mode to `INTERACTIVE` . 
     */
    override fun applicationMode(applicationMode: String) {
      cdkBuilder.applicationMode(applicationMode)
    }

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-applicationname)
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application. 
     */
    override fun runConfiguration(runConfiguration: IResolvable) {
      cdkBuilder.runConfiguration(runConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application. 
     */
    override fun runConfiguration(runConfiguration: RunConfigurationProperty) {
      cdkBuilder.runConfiguration(runConfiguration.let(RunConfigurationProperty.Companion::unwrap))
    }

    /**
     * Describes the starting parameters for an Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runconfiguration)
     * @param runConfiguration Describes the starting parameters for an Managed Service for Apache
     * Flink application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce34f73b60cb5d1d88415697e0cb762020d25f84a270c4f48813f79656d924af")
    override fun runConfiguration(runConfiguration: RunConfigurationProperty.Builder.() -> Unit):
        Unit = runConfiguration(RunConfigurationProperty(runConfiguration))

    /**
     * The runtime environment for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-runtimeenvironment)
     * @param runtimeEnvironment The runtime environment for the application. 
     */
    override fun runtimeEnvironment(runtimeEnvironment: String) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment)
    }

    /**
     * Specifies the IAM role that the application uses to access external resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-serviceexecutionrole)
     * @param serviceExecutionRole Specifies the IAM role that the application uses to access
     * external resources. 
     */
    override fun serviceExecutionRole(serviceExecutionRole: String) {
      cdkBuilder.serviceExecutionRole(serviceExecutionRole)
    }

    /**
     * A list of one or more tags to assign to the application.
     *
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
     * @param tags A list of one or more tags to assign to the application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of one or more tags to assign to the application.
     *
     * A tag is a key-value pair that identifies an application. Note that the maximum number of
     * application tags includes system tags. The maximum number of user-defined application tags is
     * 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-application.html#cfn-kinesisanalyticsv2-application-tags)
     * @param tags A list of one or more tags to assign to the application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
  }

  /**
   * Describes code configuration for an application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ApplicationCodeConfigurationProperty applicationCodeConfigurationProperty =
   * ApplicationCodeConfigurationProperty.builder()
   * .codeContent(CodeContentProperty.builder()
   * .s3ContentLocation(S3ContentLocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .textContent("textContent")
   * .zipFileContent("zipFileContent")
   * .build())
   * .codeContentType("codeContentType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html)
   */
  public interface ApplicationCodeConfigurationProperty {
    /**
     * The location and type of the application code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontent)
     */
    public fun codeContent(): Any

    /**
     * Specifies whether the code content is in text or zip format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype)
     */
    public fun codeContentType(): String

    /**
     * A builder for [ApplicationCodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeContent The location and type of the application code. 
       */
      public fun codeContent(codeContent: IResolvable)

      /**
       * @param codeContent The location and type of the application code. 
       */
      public fun codeContent(codeContent: CodeContentProperty)

      /**
       * @param codeContent The location and type of the application code. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a3fb91dbc21e3cc6ce19b0168de4b380d08d871bb4e71f1b7139a456dff68c61")
      public fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit)

      /**
       * @param codeContentType Specifies whether the code content is in text or zip format. 
       */
      public fun codeContentType(codeContentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty.builder()

      /**
       * @param codeContent The location and type of the application code. 
       */
      override fun codeContent(codeContent: IResolvable) {
        cdkBuilder.codeContent(codeContent.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeContent The location and type of the application code. 
       */
      override fun codeContent(codeContent: CodeContentProperty) {
        cdkBuilder.codeContent(codeContent.let(CodeContentProperty.Companion::unwrap))
      }

      /**
       * @param codeContent The location and type of the application code. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a3fb91dbc21e3cc6ce19b0168de4b380d08d871bb4e71f1b7139a456dff68c61")
      override fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit): Unit =
          codeContent(CodeContentProperty(codeContent))

      /**
       * @param codeContentType Specifies whether the code content is in text or zip format. 
       */
      override fun codeContentType(codeContentType: String) {
        cdkBuilder.codeContentType(codeContentType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ApplicationCodeConfigurationProperty {
      /**
       * The location and type of the application code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontent)
       */
      override fun codeContent(): Any = unwrap(this).getCodeContent()

      /**
       * Specifies whether the code content is in text or zip format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationcodeconfiguration.html#cfn-kinesisanalyticsv2-application-applicationcodeconfiguration-codecontenttype)
       */
      override fun codeContentType(): String = unwrap(this).getCodeContentType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationCodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty):
          ApplicationCodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationCodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationCodeConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty
    }
  }

  /**
   * Specifies the creation parameters for a Managed Service for Apache Flink application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ApplicationConfigurationProperty applicationConfigurationProperty =
   * ApplicationConfigurationProperty.builder()
   * .applicationCodeConfiguration(ApplicationCodeConfigurationProperty.builder()
   * .codeContent(CodeContentProperty.builder()
   * .s3ContentLocation(S3ContentLocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .textContent("textContent")
   * .zipFileContent("zipFileContent")
   * .build())
   * .codeContentType("codeContentType")
   * .build())
   * .applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty.builder()
   * .snapshotsEnabled(false)
   * .build())
   * .applicationSystemRollbackConfiguration(ApplicationSystemRollbackConfigurationProperty.builder()
   * .rollbackEnabled(false)
   * .build())
   * .environmentProperties(EnvironmentPropertiesProperty.builder()
   * .propertyGroups(List.of(PropertyGroupProperty.builder()
   * .propertyGroupId("propertyGroupId")
   * .propertyMap(Map.of(
   * "propertyMapKey", "propertyMap"))
   * .build()))
   * .build())
   * .flinkApplicationConfiguration(FlinkApplicationConfigurationProperty.builder()
   * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .checkpointingEnabled(false)
   * .checkpointInterval(123)
   * .minPauseBetweenCheckpoints(123)
   * .build())
   * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .logLevel("logLevel")
   * .metricsLevel("metricsLevel")
   * .build())
   * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .autoScalingEnabled(false)
   * .parallelism(123)
   * .parallelismPerKpu(123)
   * .build())
   * .build())
   * .sqlApplicationConfiguration(SqlApplicationConfigurationProperty.builder()
   * .inputs(List.of(InputProperty.builder()
   * .inputSchema(InputSchemaProperty.builder()
   * .recordColumns(List.of(RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build()))
   * .recordFormat(RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .recordEncoding("recordEncoding")
   * .build())
   * .namePrefix("namePrefix")
   * // the properties below are optional
   * .inputParallelism(InputParallelismProperty.builder()
   * .count(123)
   * .build())
   * .inputProcessingConfiguration(InputProcessingConfigurationProperty.builder()
   * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .build())
   * .kinesisFirehoseInput(KinesisFirehoseInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .kinesisStreamsInput(KinesisStreamsInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .build()))
   * .build())
   * .vpcConfigurations(List.of(VpcConfigurationProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build()))
   * .zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty.builder()
   * .catalogConfiguration(CatalogConfigurationProperty.builder()
   * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
   * .databaseArn("databaseArn")
   * .build())
   * .build())
   * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
   * .artifactType("artifactType")
   * // the properties below are optional
   * .mavenReference(MavenReferenceProperty.builder()
   * .artifactId("artifactId")
   * .groupId("groupId")
   * .version("version")
   * .build())
   * .s3ContentLocation(S3ContentLocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .build()))
   * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
   * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .basePath("basePath")
   * .build())
   * .build())
   * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
   * .logLevel("logLevel")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html)
   */
  public interface ApplicationConfigurationProperty {
    /**
     * The code location and type parameters for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationcodeconfiguration)
     */
    public fun applicationCodeConfiguration(): Any? = unwrap(this).getApplicationCodeConfiguration()

    /**
     * Describes whether snapshots are enabled for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationsnapshotconfiguration)
     */
    public fun applicationSnapshotConfiguration(): Any? =
        unwrap(this).getApplicationSnapshotConfiguration()

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationsystemrollbackconfiguration)
     */
    public fun applicationSystemRollbackConfiguration(): Any? =
        unwrap(this).getApplicationSystemRollbackConfiguration()

    /**
     * Describes execution properties for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-environmentproperties)
     */
    public fun environmentProperties(): Any? = unwrap(this).getEnvironmentProperties()

    /**
     * The creation and update parameters for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-flinkapplicationconfiguration)
     */
    public fun flinkApplicationConfiguration(): Any? =
        unwrap(this).getFlinkApplicationConfiguration()

    /**
     * The creation and update parameters for a SQL-based Kinesis Data Analytics application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-sqlapplicationconfiguration)
     */
    public fun sqlApplicationConfiguration(): Any? = unwrap(this).getSqlApplicationConfiguration()

    /**
     * The array of descriptions of VPC configurations available to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-vpcconfigurations)
     */
    public fun vpcConfigurations(): Any? = unwrap(this).getVpcConfigurations()

    /**
     * The configuration parameters for a Kinesis Data Analytics Studio notebook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-zeppelinapplicationconfiguration)
     */
    public fun zeppelinApplicationConfiguration(): Any? =
        unwrap(this).getZeppelinApplicationConfiguration()

    /**
     * A builder for [ApplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationCodeConfiguration The code location and type parameters for a Managed
       * Service for Apache Flink application.
       */
      public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable)

      /**
       * @param applicationCodeConfiguration The code location and type parameters for a Managed
       * Service for Apache Flink application.
       */
      public
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty)

      /**
       * @param applicationCodeConfiguration The code location and type parameters for a Managed
       * Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7877605fae94fba496f67774d5d0c87b057f5ae11416a71bdaa1fe79869842d")
      public
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
       * Managed Service for Apache Flink application.
       */
      public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable)

      /**
       * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
       * Managed Service for Apache Flink application.
       */
      public
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty)

      /**
       * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
       * Managed Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c493a91d69b8dc48f8c1ad0ebc0e1b74f07722c317dc8997c11b2c34afac13")
      public
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty.Builder.() -> Unit)

      /**
       * @param applicationSystemRollbackConfiguration Describes whether system rollbacks are
       * enabled for a Managed Service for Apache Flink application.
       */
      public
          fun applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration: IResolvable)

      /**
       * @param applicationSystemRollbackConfiguration Describes whether system rollbacks are
       * enabled for a Managed Service for Apache Flink application.
       */
      public
          fun applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration: ApplicationSystemRollbackConfigurationProperty)

      /**
       * @param applicationSystemRollbackConfiguration Describes whether system rollbacks are
       * enabled for a Managed Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d65c2f61494791a448d88e809457ed8e43339d53871afe30eddab52451ad53b")
      public
          fun applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration: ApplicationSystemRollbackConfigurationProperty.Builder.() -> Unit)

      /**
       * @param environmentProperties Describes execution properties for a Managed Service for
       * Apache Flink application.
       */
      public fun environmentProperties(environmentProperties: IResolvable)

      /**
       * @param environmentProperties Describes execution properties for a Managed Service for
       * Apache Flink application.
       */
      public fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty)

      /**
       * @param environmentProperties Describes execution properties for a Managed Service for
       * Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("705a63a4a7f4fbb572532c29eea797caa1d0c8a1cbba17fdf4e7e0b5c6f54d8c")
      public
          fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit)

      /**
       * @param flinkApplicationConfiguration The creation and update parameters for a Managed
       * Service for Apache Flink application.
       */
      public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable)

      /**
       * @param flinkApplicationConfiguration The creation and update parameters for a Managed
       * Service for Apache Flink application.
       */
      public
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty)

      /**
       * @param flinkApplicationConfiguration The creation and update parameters for a Managed
       * Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("492f8c55c68e53f189bb6f6c90483e42a3e09abeabbe7f54bd0ea1b7f1aa5148")
      public
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
       * Kinesis Data Analytics application.
       */
      public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable)

      /**
       * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
       * Kinesis Data Analytics application.
       */
      public
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty)

      /**
       * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
       * Kinesis Data Analytics application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("739a9d42cdc613f937634ee485e7018d1f8244cb03e497d08ddcbafa23ee4cd0")
      public
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param vpcConfigurations The array of descriptions of VPC configurations available to the
       * application.
       */
      public fun vpcConfigurations(vpcConfigurations: IResolvable)

      /**
       * @param vpcConfigurations The array of descriptions of VPC configurations available to the
       * application.
       */
      public fun vpcConfigurations(vpcConfigurations: List<Any>)

      /**
       * @param vpcConfigurations The array of descriptions of VPC configurations available to the
       * application.
       */
      public fun vpcConfigurations(vararg vpcConfigurations: Any)

      /**
       * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
       * Analytics Studio notebook.
       */
      public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable)

      /**
       * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
       * Analytics Studio notebook.
       */
      public
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty)

      /**
       * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
       * Analytics Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71a50890c438f318a456fa31701c47d511cfa429d6fe6cd84ddaa94fc1d40f6")
      public
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty.builder()

      /**
       * @param applicationCodeConfiguration The code location and type parameters for a Managed
       * Service for Apache Flink application.
       */
      override fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param applicationCodeConfiguration The code location and type parameters for a Managed
       * Service for Apache Flink application.
       */
      override
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration.let(ApplicationCodeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param applicationCodeConfiguration The code location and type parameters for a Managed
       * Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7877605fae94fba496f67774d5d0c87b057f5ae11416a71bdaa1fe79869842d")
      override
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationCodeConfiguration(ApplicationCodeConfigurationProperty(applicationCodeConfiguration))

      /**
       * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
       * Managed Service for Apache Flink application.
       */
      override fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
       * Managed Service for Apache Flink application.
       */
      override
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration.let(ApplicationSnapshotConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a
       * Managed Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c493a91d69b8dc48f8c1ad0ebc0e1b74f07722c317dc8997c11b2c34afac13")
      override
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty(applicationSnapshotConfiguration))

      /**
       * @param applicationSystemRollbackConfiguration Describes whether system rollbacks are
       * enabled for a Managed Service for Apache Flink application.
       */
      override
          fun applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration: IResolvable) {
        cdkBuilder.applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param applicationSystemRollbackConfiguration Describes whether system rollbacks are
       * enabled for a Managed Service for Apache Flink application.
       */
      override
          fun applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration: ApplicationSystemRollbackConfigurationProperty) {
        cdkBuilder.applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration.let(ApplicationSystemRollbackConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param applicationSystemRollbackConfiguration Describes whether system rollbacks are
       * enabled for a Managed Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d65c2f61494791a448d88e809457ed8e43339d53871afe30eddab52451ad53b")
      override
          fun applicationSystemRollbackConfiguration(applicationSystemRollbackConfiguration: ApplicationSystemRollbackConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationSystemRollbackConfiguration(ApplicationSystemRollbackConfigurationProperty(applicationSystemRollbackConfiguration))

      /**
       * @param environmentProperties Describes execution properties for a Managed Service for
       * Apache Flink application.
       */
      override fun environmentProperties(environmentProperties: IResolvable) {
        cdkBuilder.environmentProperties(environmentProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentProperties Describes execution properties for a Managed Service for
       * Apache Flink application.
       */
      override fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty) {
        cdkBuilder.environmentProperties(environmentProperties.let(EnvironmentPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param environmentProperties Describes execution properties for a Managed Service for
       * Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("705a63a4a7f4fbb572532c29eea797caa1d0c8a1cbba17fdf4e7e0b5c6f54d8c")
      override
          fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit):
          Unit = environmentProperties(EnvironmentPropertiesProperty(environmentProperties))

      /**
       * @param flinkApplicationConfiguration The creation and update parameters for a Managed
       * Service for Apache Flink application.
       */
      override fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param flinkApplicationConfiguration The creation and update parameters for a Managed
       * Service for Apache Flink application.
       */
      override
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration.let(FlinkApplicationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param flinkApplicationConfiguration The creation and update parameters for a Managed
       * Service for Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("492f8c55c68e53f189bb6f6c90483e42a3e09abeabbe7f54bd0ea1b7f1aa5148")
      override
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          flinkApplicationConfiguration(FlinkApplicationConfigurationProperty(flinkApplicationConfiguration))

      /**
       * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
       * Kinesis Data Analytics application.
       */
      override fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
       * Kinesis Data Analytics application.
       */
      override
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration.let(SqlApplicationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param sqlApplicationConfiguration The creation and update parameters for a SQL-based
       * Kinesis Data Analytics application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("739a9d42cdc613f937634ee485e7018d1f8244cb03e497d08ddcbafa23ee4cd0")
      override
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          sqlApplicationConfiguration(SqlApplicationConfigurationProperty(sqlApplicationConfiguration))

      /**
       * @param vpcConfigurations The array of descriptions of VPC configurations available to the
       * application.
       */
      override fun vpcConfigurations(vpcConfigurations: IResolvable) {
        cdkBuilder.vpcConfigurations(vpcConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcConfigurations The array of descriptions of VPC configurations available to the
       * application.
       */
      override fun vpcConfigurations(vpcConfigurations: List<Any>) {
        cdkBuilder.vpcConfigurations(vpcConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vpcConfigurations The array of descriptions of VPC configurations available to the
       * application.
       */
      override fun vpcConfigurations(vararg vpcConfigurations: Any): Unit =
          vpcConfigurations(vpcConfigurations.toList())

      /**
       * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
       * Analytics Studio notebook.
       */
      override fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
       * Analytics Studio notebook.
       */
      override
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration.let(ZeppelinApplicationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param zeppelinApplicationConfiguration The configuration parameters for a Kinesis Data
       * Analytics Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71a50890c438f318a456fa31701c47d511cfa429d6fe6cd84ddaa94fc1d40f6")
      override
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty(zeppelinApplicationConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty,
    ) : CdkObject(cdkObject),
        ApplicationConfigurationProperty {
      /**
       * The code location and type parameters for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationcodeconfiguration)
       */
      override fun applicationCodeConfiguration(): Any? =
          unwrap(this).getApplicationCodeConfiguration()

      /**
       * Describes whether snapshots are enabled for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationsnapshotconfiguration)
       */
      override fun applicationSnapshotConfiguration(): Any? =
          unwrap(this).getApplicationSnapshotConfiguration()

      /**
       * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink
       * application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-applicationsystemrollbackconfiguration)
       */
      override fun applicationSystemRollbackConfiguration(): Any? =
          unwrap(this).getApplicationSystemRollbackConfiguration()

      /**
       * Describes execution properties for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-environmentproperties)
       */
      override fun environmentProperties(): Any? = unwrap(this).getEnvironmentProperties()

      /**
       * The creation and update parameters for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-flinkapplicationconfiguration)
       */
      override fun flinkApplicationConfiguration(): Any? =
          unwrap(this).getFlinkApplicationConfiguration()

      /**
       * The creation and update parameters for a SQL-based Kinesis Data Analytics application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-sqlapplicationconfiguration)
       */
      override fun sqlApplicationConfiguration(): Any? =
          unwrap(this).getSqlApplicationConfiguration()

      /**
       * The array of descriptions of VPC configurations available to the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-vpcconfigurations)
       */
      override fun vpcConfigurations(): Any? = unwrap(this).getVpcConfigurations()

      /**
       * The configuration parameters for a Kinesis Data Analytics Studio notebook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationconfiguration.html#cfn-kinesisanalyticsv2-application-applicationconfiguration-zeppelinapplicationconfiguration)
       */
      override fun zeppelinApplicationConfiguration(): Any? =
          unwrap(this).getZeppelinApplicationConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty):
          ApplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty
    }
  }

  /**
   * Describes the maintenance configuration for the application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ApplicationMaintenanceConfigurationProperty applicationMaintenanceConfigurationProperty =
   * ApplicationMaintenanceConfigurationProperty.builder()
   * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html)
   */
  public interface ApplicationMaintenanceConfigurationProperty {
    /**
     * The start time for the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration-applicationmaintenancewindowstarttime)
     */
    public fun applicationMaintenanceWindowStartTime(): String

    /**
     * A builder for [ApplicationMaintenanceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationMaintenanceWindowStartTime The start time for the maintenance window. 
       */
      public
          fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty.builder()

      /**
       * @param applicationMaintenanceWindowStartTime The start time for the maintenance window. 
       */
      override
          fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String) {
        cdkBuilder.applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty,
    ) : CdkObject(cdkObject),
        ApplicationMaintenanceConfigurationProperty {
      /**
       * The start time for the maintenance window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html#cfn-kinesisanalyticsv2-application-applicationmaintenanceconfiguration-applicationmaintenancewindowstarttime)
       */
      override fun applicationMaintenanceWindowStartTime(): String =
          unwrap(this).getApplicationMaintenanceWindowStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationMaintenanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty):
          ApplicationMaintenanceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationMaintenanceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationMaintenanceConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty
    }
  }

  /**
   * Specifies the method and snapshot to use when restarting an application using previously saved
   * application state.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ApplicationRestoreConfigurationProperty applicationRestoreConfigurationProperty =
   * ApplicationRestoreConfigurationProperty.builder()
   * .applicationRestoreType("applicationRestoreType")
   * // the properties below are optional
   * .snapshotName("snapshotName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html)
   */
  public interface ApplicationRestoreConfigurationProperty {
    /**
     * Specifies how the application should be restored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-applicationrestoretype)
     */
    public fun applicationRestoreType(): String

    /**
     * The identifier of an existing snapshot of application state to use to restart an application.
     *
     * The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the
     * `ApplicationRestoreType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-snapshotname)
     */
    public fun snapshotName(): String? = unwrap(this).getSnapshotName()

    /**
     * A builder for [ApplicationRestoreConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationRestoreType Specifies how the application should be restored. 
       */
      public fun applicationRestoreType(applicationRestoreType: String)

      /**
       * @param snapshotName The identifier of an existing snapshot of application state to use to
       * restart an application.
       * The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the
       * `ApplicationRestoreType` .
       */
      public fun snapshotName(snapshotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty.builder()

      /**
       * @param applicationRestoreType Specifies how the application should be restored. 
       */
      override fun applicationRestoreType(applicationRestoreType: String) {
        cdkBuilder.applicationRestoreType(applicationRestoreType)
      }

      /**
       * @param snapshotName The identifier of an existing snapshot of application state to use to
       * restart an application.
       * The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the
       * `ApplicationRestoreType` .
       */
      override fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty,
    ) : CdkObject(cdkObject),
        ApplicationRestoreConfigurationProperty {
      /**
       * Specifies how the application should be restored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-applicationrestoretype)
       */
      override fun applicationRestoreType(): String = unwrap(this).getApplicationRestoreType()

      /**
       * The identifier of an existing snapshot of application state to use to restart an
       * application.
       *
       * The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the
       * `ApplicationRestoreType` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationrestoreconfiguration.html#cfn-kinesisanalyticsv2-application-applicationrestoreconfiguration-snapshotname)
       */
      override fun snapshotName(): String? = unwrap(this).getSnapshotName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationRestoreConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty):
          ApplicationRestoreConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationRestoreConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationRestoreConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty
    }
  }

  /**
   * Describes whether snapshots are enabled for a Managed Service for Apache Flink application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ApplicationSnapshotConfigurationProperty applicationSnapshotConfigurationProperty =
   * ApplicationSnapshotConfigurationProperty.builder()
   * .snapshotsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html)
   */
  public interface ApplicationSnapshotConfigurationProperty {
    /**
     * Describes whether snapshots are enabled for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled)
     */
    public fun snapshotsEnabled(): Any

    /**
     * A builder for [ApplicationSnapshotConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service for
       * Apache Flink application. 
       */
      public fun snapshotsEnabled(snapshotsEnabled: Boolean)

      /**
       * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service for
       * Apache Flink application. 
       */
      public fun snapshotsEnabled(snapshotsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty.builder()

      /**
       * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service for
       * Apache Flink application. 
       */
      override fun snapshotsEnabled(snapshotsEnabled: Boolean) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled)
      }

      /**
       * @param snapshotsEnabled Describes whether snapshots are enabled for a Managed Service for
       * Apache Flink application. 
       */
      override fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty,
    ) : CdkObject(cdkObject),
        ApplicationSnapshotConfigurationProperty {
      /**
       * Describes whether snapshots are enabled for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsnapshotconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsnapshotconfiguration-snapshotsenabled)
       */
      override fun snapshotsEnabled(): Any = unwrap(this).getSnapshotsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationSnapshotConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty):
          ApplicationSnapshotConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationSnapshotConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSnapshotConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty
    }
  }

  /**
   * Describes the system rollback configuration for a Managed Service for Apache Flink application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ApplicationSystemRollbackConfigurationProperty applicationSystemRollbackConfigurationProperty =
   * ApplicationSystemRollbackConfigurationProperty.builder()
   * .rollbackEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsystemrollbackconfiguration.html)
   */
  public interface ApplicationSystemRollbackConfigurationProperty {
    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsystemrollbackconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsystemrollbackconfiguration-rollbackenabled)
     */
    public fun rollbackEnabled(): Any

    /**
     * A builder for [ApplicationSystemRollbackConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rollbackEnabled Describes whether system rollbacks are enabled for a Managed Service
       * for Apache Flink application. 
       */
      public fun rollbackEnabled(rollbackEnabled: Boolean)

      /**
       * @param rollbackEnabled Describes whether system rollbacks are enabled for a Managed Service
       * for Apache Flink application. 
       */
      public fun rollbackEnabled(rollbackEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSystemRollbackConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSystemRollbackConfigurationProperty.builder()

      /**
       * @param rollbackEnabled Describes whether system rollbacks are enabled for a Managed Service
       * for Apache Flink application. 
       */
      override fun rollbackEnabled(rollbackEnabled: Boolean) {
        cdkBuilder.rollbackEnabled(rollbackEnabled)
      }

      /**
       * @param rollbackEnabled Describes whether system rollbacks are enabled for a Managed Service
       * for Apache Flink application. 
       */
      override fun rollbackEnabled(rollbackEnabled: IResolvable) {
        cdkBuilder.rollbackEnabled(rollbackEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSystemRollbackConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSystemRollbackConfigurationProperty,
    ) : CdkObject(cdkObject),
        ApplicationSystemRollbackConfigurationProperty {
      /**
       * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink
       * application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationsystemrollbackconfiguration.html#cfn-kinesisanalyticsv2-application-applicationsystemrollbackconfiguration-rollbackenabled)
       */
      override fun rollbackEnabled(): Any = unwrap(this).getRollbackEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationSystemRollbackConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSystemRollbackConfigurationProperty):
          ApplicationSystemRollbackConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationSystemRollbackConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSystemRollbackConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSystemRollbackConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSystemRollbackConfigurationProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
   * when the record format uses delimiters, such as CSV.
   *
   * For example, the following sample records use CSV format, where the records use the *'\n'* as
   * the row delimiter and a comma (",") as the column delimiter:
   *
   * `"name1", "address1"`
   *
   * `"name2", "address2"`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * CSVMappingParametersProperty cSVMappingParametersProperty =
   * CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html)
   */
  public interface CSVMappingParametersProperty {
    /**
     * The column delimiter.
     *
     * For example, in a CSV format, a comma (",") is the typical column delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordcolumndelimiter)
     */
    public fun recordColumnDelimiter(): String

    /**
     * The row delimiter.
     *
     * For example, in a CSV format, *'\n'* is the typical row delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordrowdelimiter)
     */
    public fun recordRowDelimiter(): String

    /**
     * A builder for [CSVMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumnDelimiter The column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      public fun recordColumnDelimiter(recordColumnDelimiter: String)

      /**
       * @param recordRowDelimiter The row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      public fun recordRowDelimiter(recordRowDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty.builder()

      /**
       * @param recordColumnDelimiter The column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      /**
       * @param recordRowDelimiter The row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty,
    ) : CdkObject(cdkObject),
        CSVMappingParametersProperty {
      /**
       * The column delimiter.
       *
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordcolumndelimiter)
       */
      override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      /**
       * The row delimiter.
       *
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-csvmappingparameters.html#cfn-kinesisanalyticsv2-application-csvmappingparameters-recordrowdelimiter)
       */
      override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty):
          CSVMappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CSVMappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty
    }
  }

  /**
   * The configuration parameters for the default Amazon Glue database.
   *
   * You use this database for SQL queries that you write in a Kinesis Data Analytics Studio
   * notebook.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * CatalogConfigurationProperty catalogConfigurationProperty =
   * CatalogConfigurationProperty.builder()
   * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
   * .databaseArn("databaseArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html)
   */
  public interface CatalogConfigurationProperty {
    /**
     * The configuration parameters for the default Amazon Glue database.
     *
     * You use this database for Apache Flink SQL queries and table API transforms that you write in
     * a Kinesis Data Analytics Studio notebook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html#cfn-kinesisanalyticsv2-application-catalogconfiguration-gluedatacatalogconfiguration)
     */
    public fun glueDataCatalogConfiguration(): Any? = unwrap(this).getGlueDataCatalogConfiguration()

    /**
     * A builder for [CatalogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon
       * Glue database.
       * You use this database for Apache Flink SQL queries and table API transforms that you write
       * in a Kinesis Data Analytics Studio notebook.
       */
      public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable)

      /**
       * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon
       * Glue database.
       * You use this database for Apache Flink SQL queries and table API transforms that you write
       * in a Kinesis Data Analytics Studio notebook.
       */
      public
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty)

      /**
       * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon
       * Glue database.
       * You use this database for Apache Flink SQL queries and table API transforms that you write
       * in a Kinesis Data Analytics Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f62b16cd7f274a8d7a905a434ec38b4e1ac7edaf883d3f91aecad961cb58008")
      public
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty.builder()

      /**
       * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon
       * Glue database.
       * You use this database for Apache Flink SQL queries and table API transforms that you write
       * in a Kinesis Data Analytics Studio notebook.
       */
      override fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon
       * Glue database.
       * You use this database for Apache Flink SQL queries and table API transforms that you write
       * in a Kinesis Data Analytics Studio notebook.
       */
      override
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration.let(GlueDataCatalogConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon
       * Glue database.
       * You use this database for Apache Flink SQL queries and table API transforms that you write
       * in a Kinesis Data Analytics Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f62b16cd7f274a8d7a905a434ec38b4e1ac7edaf883d3f91aecad961cb58008")
      override
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty.Builder.() -> Unit):
          Unit =
          glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty(glueDataCatalogConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty,
    ) : CdkObject(cdkObject),
        CatalogConfigurationProperty {
      /**
       * The configuration parameters for the default Amazon Glue database.
       *
       * You use this database for Apache Flink SQL queries and table API transforms that you write
       * in a Kinesis Data Analytics Studio notebook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html#cfn-kinesisanalyticsv2-application-catalogconfiguration-gluedatacatalogconfiguration)
       */
      override fun glueDataCatalogConfiguration(): Any? =
          unwrap(this).getGlueDataCatalogConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CatalogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty):
          CatalogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CatalogConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CatalogConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty
    }
  }

  /**
   * Describes an application's checkpointing configuration.
   *
   * Checkpointing is the process of persisting application state for fault tolerance. For more
   * information, see [Checkpoints for Fault
   * Tolerance](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/dev/datastream/fault-tolerance/checkpointing/)
   * in the [Apache Flink
   * Documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * CheckpointConfigurationProperty checkpointConfigurationProperty =
   * CheckpointConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .checkpointingEnabled(false)
   * .checkpointInterval(123)
   * .minPauseBetweenCheckpoints(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html)
   */
  public interface CheckpointConfigurationProperty {
    /**
     * Describes the interval in milliseconds between checkpoint operations.
     *
     *
     * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
     * `CheckpointInterval` value of 60000, even if this value is set to another value using this API
     * or in application code.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval)
     */
    public fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

    /**
     * Describes whether checkpointing is enabled for a Managed Service for Apache Flink
     * application.
     *
     *
     * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
     * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this
     * API or in application code.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled)
     */
    public fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

    /**
     * Describes whether the application uses Managed Service for Apache Flink' default
     * checkpointing behavior.
     *
     * You must set this property to `CUSTOM` in order to set the `CheckpointingEnabled` ,
     * `CheckpointInterval` , or `MinPauseBetweenCheckpoints` parameters.
     *
     *
     * If this value is set to `DEFAULT` , the application will use the following values, even if
     * they are set to other values using APIs or application code:
     *
     * * *CheckpointingEnabled:* true
     * * *CheckpointInterval:* 60000
     * * *MinPauseBetweenCheckpoints:* 5000
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype)
     */
    public fun configurationType(): String

    /**
     * Describes the minimum time in milliseconds after a checkpoint operation completes that a new
     * checkpoint operation can start.
     *
     * If a checkpoint operation takes longer than the `CheckpointInterval` , the application
     * otherwise performs continual checkpoint operations. For more information, see [Tuning
     * Checkpointing](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/large_state_tuning/#tuning-checkpointing)
     * in the [Apache Flink
     * Documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
     * .
     *
     *
     * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
     * `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using this API or in
     * application code.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints)
     */
    public fun minPauseBetweenCheckpoints(): Number? = unwrap(this).getMinPauseBetweenCheckpoints()

    /**
     * A builder for [CheckpointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param checkpointInterval Describes the interval in milliseconds between checkpoint
       * operations.
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointInterval` value of 60000, even if this value is set to another value using this API
       * or in application code.
       */
      public fun checkpointInterval(checkpointInterval: Number)

      /**
       * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
       * Service for Apache Flink application.
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this
       * API or in application code.
       */
      public fun checkpointingEnabled(checkpointingEnabled: Boolean)

      /**
       * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
       * Service for Apache Flink application.
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this
       * API or in application code.
       */
      public fun checkpointingEnabled(checkpointingEnabled: IResolvable)

      /**
       * @param configurationType Describes whether the application uses Managed Service for Apache
       * Flink' default checkpointing behavior. 
       * You must set this property to `CUSTOM` in order to set the `CheckpointingEnabled` ,
       * `CheckpointInterval` , or `MinPauseBetweenCheckpoints` parameters.
       *
       *
       * If this value is set to `DEFAULT` , the application will use the following values, even if
       * they are set to other values using APIs or application code:
       *
       * * *CheckpointingEnabled:* true
       * * *CheckpointInterval:* 60000
       * * *MinPauseBetweenCheckpoints:* 5000
       */
      public fun configurationType(configurationType: String)

      /**
       * @param minPauseBetweenCheckpoints Describes the minimum time in milliseconds after a
       * checkpoint operation completes that a new checkpoint operation can start.
       * If a checkpoint operation takes longer than the `CheckpointInterval` , the application
       * otherwise performs continual checkpoint operations. For more information, see [Tuning
       * Checkpointing](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/large_state_tuning/#tuning-checkpointing)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using this API or in
       * application code.
       */
      public fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty.builder()

      /**
       * @param checkpointInterval Describes the interval in milliseconds between checkpoint
       * operations.
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointInterval` value of 60000, even if this value is set to another value using this API
       * or in application code.
       */
      override fun checkpointInterval(checkpointInterval: Number) {
        cdkBuilder.checkpointInterval(checkpointInterval)
      }

      /**
       * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
       * Service for Apache Flink application.
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this
       * API or in application code.
       */
      override fun checkpointingEnabled(checkpointingEnabled: Boolean) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled)
      }

      /**
       * @param checkpointingEnabled Describes whether checkpointing is enabled for a Managed
       * Service for Apache Flink application.
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this
       * API or in application code.
       */
      override fun checkpointingEnabled(checkpointingEnabled: IResolvable) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configurationType Describes whether the application uses Managed Service for Apache
       * Flink' default checkpointing behavior. 
       * You must set this property to `CUSTOM` in order to set the `CheckpointingEnabled` ,
       * `CheckpointInterval` , or `MinPauseBetweenCheckpoints` parameters.
       *
       *
       * If this value is set to `DEFAULT` , the application will use the following values, even if
       * they are set to other values using APIs or application code:
       *
       * * *CheckpointingEnabled:* true
       * * *CheckpointInterval:* 60000
       * * *MinPauseBetweenCheckpoints:* 5000
       */
      override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      /**
       * @param minPauseBetweenCheckpoints Describes the minimum time in milliseconds after a
       * checkpoint operation completes that a new checkpoint operation can start.
       * If a checkpoint operation takes longer than the `CheckpointInterval` , the application
       * otherwise performs continual checkpoint operations. For more information, see [Tuning
       * Checkpointing](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/large_state_tuning/#tuning-checkpointing)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using this API or in
       * application code.
       */
      override fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number) {
        cdkBuilder.minPauseBetweenCheckpoints(minPauseBetweenCheckpoints)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty,
    ) : CdkObject(cdkObject),
        CheckpointConfigurationProperty {
      /**
       * Describes the interval in milliseconds between checkpoint operations.
       *
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointInterval` value of 60000, even if this value is set to another value using this API
       * or in application code.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointinterval)
       */
      override fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

      /**
       * Describes whether checkpointing is enabled for a Managed Service for Apache Flink
       * application.
       *
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `CheckpointingEnabled` value of `true` , even if this value is set to another value using this
       * API or in application code.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-checkpointingenabled)
       */
      override fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

      /**
       * Describes whether the application uses Managed Service for Apache Flink' default
       * checkpointing behavior.
       *
       * You must set this property to `CUSTOM` in order to set the `CheckpointingEnabled` ,
       * `CheckpointInterval` , or `MinPauseBetweenCheckpoints` parameters.
       *
       *
       * If this value is set to `DEFAULT` , the application will use the following values, even if
       * they are set to other values using APIs or application code:
       *
       * * *CheckpointingEnabled:* true
       * * *CheckpointInterval:* 60000
       * * *MinPauseBetweenCheckpoints:* 5000
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-configurationtype)
       */
      override fun configurationType(): String = unwrap(this).getConfigurationType()

      /**
       * Describes the minimum time in milliseconds after a checkpoint operation completes that a
       * new checkpoint operation can start.
       *
       * If a checkpoint operation takes longer than the `CheckpointInterval` , the application
       * otherwise performs continual checkpoint operations. For more information, see [Tuning
       * Checkpointing](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/large_state_tuning/#tuning-checkpointing)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * If `CheckpointConfiguration.ConfigurationType` is `DEFAULT` , the application will use a
       * `MinPauseBetweenCheckpoints` value of 5000, even if this value is set using this API or in
       * application code.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-checkpointconfiguration.html#cfn-kinesisanalyticsv2-application-checkpointconfiguration-minpausebetweencheckpoints)
       */
      override fun minPauseBetweenCheckpoints(): Number? =
          unwrap(this).getMinPauseBetweenCheckpoints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CheckpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty):
          CheckpointConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CheckpointConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CheckpointConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty
    }
  }

  /**
   * Specifies either the application code, or the location of the application code, for a Managed
   * Service for Apache Flink application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * CodeContentProperty codeContentProperty = CodeContentProperty.builder()
   * .s3ContentLocation(S3ContentLocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .textContent("textContent")
   * .zipFileContent("zipFileContent")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html)
   */
  public interface CodeContentProperty {
    /**
     * Information about the Amazon S3 bucket that contains the application code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-s3contentlocation)
     */
    public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

    /**
     * The text-format code for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent)
     */
    public fun textContent(): String? = unwrap(this).getTextContent()

    /**
     * The zip-format code for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent)
     */
    public fun zipFileContent(): String? = unwrap(this).getZipFileContent()

    /**
     * A builder for [CodeContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
       * application code.
       */
      public fun s3ContentLocation(s3ContentLocation: IResolvable)

      /**
       * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
       * application code.
       */
      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty)

      /**
       * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
       * application code.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e31dd285444d0e1a125e82c148ade00d1df2f0ec7159b1b49f03f585f5f5183a")
      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit)

      /**
       * @param textContent The text-format code for a Managed Service for Apache Flink application.
       */
      public fun textContent(textContent: String)

      /**
       * @param zipFileContent The zip-format code for a Managed Service for Apache Flink
       * application.
       */
      public fun zipFileContent(zipFileContent: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty.builder()

      /**
       * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
       * application code.
       */
      override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
       * application code.
       */
      override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentLocationProperty.Companion::unwrap))
      }

      /**
       * @param s3ContentLocation Information about the Amazon S3 bucket that contains the
       * application code.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e31dd285444d0e1a125e82c148ade00d1df2f0ec7159b1b49f03f585f5f5183a")
      override
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

      /**
       * @param textContent The text-format code for a Managed Service for Apache Flink application.
       */
      override fun textContent(textContent: String) {
        cdkBuilder.textContent(textContent)
      }

      /**
       * @param zipFileContent The zip-format code for a Managed Service for Apache Flink
       * application.
       */
      override fun zipFileContent(zipFileContent: String) {
        cdkBuilder.zipFileContent(zipFileContent)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty,
    ) : CdkObject(cdkObject),
        CodeContentProperty {
      /**
       * Information about the Amazon S3 bucket that contains the application code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-s3contentlocation)
       */
      override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

      /**
       * The text-format code for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent)
       */
      override fun textContent(): String? = unwrap(this).getTextContent()

      /**
       * The zip-format code for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent)
       */
      override fun zipFileContent(): String? = unwrap(this).getZipFileContent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty):
          CodeContentProperty = CdkObjectWrappers.wrap(cdkObject) as? CodeContentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeContentProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty
    }
  }

  /**
   * The configuration of connectors and user-defined functions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * CustomArtifactConfigurationProperty customArtifactConfigurationProperty =
   * CustomArtifactConfigurationProperty.builder()
   * .artifactType("artifactType")
   * // the properties below are optional
   * .mavenReference(MavenReferenceProperty.builder()
   * .artifactId("artifactId")
   * .groupId("groupId")
   * .version("version")
   * .build())
   * .s3ContentLocation(S3ContentLocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html)
   */
  public interface CustomArtifactConfigurationProperty {
    /**
     * Set this to either `UDF` or `DEPENDENCY_JAR` .
     *
     * `UDF` stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     * `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-artifacttype)
     */
    public fun artifactType(): String

    /**
     * The parameters required to fully specify a Maven reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-mavenreference)
     */
    public fun mavenReference(): Any? = unwrap(this).getMavenReference()

    /**
     * The location of the custom artifacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-s3contentlocation)
     */
    public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

    /**
     * A builder for [CustomArtifactConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifactType Set this to either `UDF` or `DEPENDENCY_JAR` . 
       * `UDF` stands for user-defined functions. This type of artifact must be in an S3 bucket. A
       * `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
       */
      public fun artifactType(artifactType: String)

      /**
       * @param mavenReference The parameters required to fully specify a Maven reference.
       */
      public fun mavenReference(mavenReference: IResolvable)

      /**
       * @param mavenReference The parameters required to fully specify a Maven reference.
       */
      public fun mavenReference(mavenReference: MavenReferenceProperty)

      /**
       * @param mavenReference The parameters required to fully specify a Maven reference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e096744746960911110c857c18c37af8ae7430914754fef46175e251e5b2a4d7")
      public fun mavenReference(mavenReference: MavenReferenceProperty.Builder.() -> Unit)

      /**
       * @param s3ContentLocation The location of the custom artifacts.
       */
      public fun s3ContentLocation(s3ContentLocation: IResolvable)

      /**
       * @param s3ContentLocation The location of the custom artifacts.
       */
      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty)

      /**
       * @param s3ContentLocation The location of the custom artifacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd77deb408ba4de3bb61f74cdd1eb47c1893b5d3ab123634ab65c01db6564fe")
      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty.builder()

      /**
       * @param artifactType Set this to either `UDF` or `DEPENDENCY_JAR` . 
       * `UDF` stands for user-defined functions. This type of artifact must be in an S3 bucket. A
       * `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
       */
      override fun artifactType(artifactType: String) {
        cdkBuilder.artifactType(artifactType)
      }

      /**
       * @param mavenReference The parameters required to fully specify a Maven reference.
       */
      override fun mavenReference(mavenReference: IResolvable) {
        cdkBuilder.mavenReference(mavenReference.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mavenReference The parameters required to fully specify a Maven reference.
       */
      override fun mavenReference(mavenReference: MavenReferenceProperty) {
        cdkBuilder.mavenReference(mavenReference.let(MavenReferenceProperty.Companion::unwrap))
      }

      /**
       * @param mavenReference The parameters required to fully specify a Maven reference.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e096744746960911110c857c18c37af8ae7430914754fef46175e251e5b2a4d7")
      override fun mavenReference(mavenReference: MavenReferenceProperty.Builder.() -> Unit): Unit =
          mavenReference(MavenReferenceProperty(mavenReference))

      /**
       * @param s3ContentLocation The location of the custom artifacts.
       */
      override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3ContentLocation The location of the custom artifacts.
       */
      override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentLocationProperty.Companion::unwrap))
      }

      /**
       * @param s3ContentLocation The location of the custom artifacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd77deb408ba4de3bb61f74cdd1eb47c1893b5d3ab123634ab65c01db6564fe")
      override
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty,
    ) : CdkObject(cdkObject),
        CustomArtifactConfigurationProperty {
      /**
       * Set this to either `UDF` or `DEPENDENCY_JAR` .
       *
       * `UDF` stands for user-defined functions. This type of artifact must be in an S3 bucket. A
       * `DEPENDENCY_JAR` can be in either Maven or an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-artifacttype)
       */
      override fun artifactType(): String = unwrap(this).getArtifactType()

      /**
       * The parameters required to fully specify a Maven reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-mavenreference)
       */
      override fun mavenReference(): Any? = unwrap(this).getMavenReference()

      /**
       * The location of the custom artifacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-customartifactconfiguration.html#cfn-kinesisanalyticsv2-application-customartifactconfiguration-s3contentlocation)
       */
      override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomArtifactConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty):
          CustomArtifactConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomArtifactConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomArtifactConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty
    }
  }

  /**
   * The information required to deploy a Kinesis Data Analytics Studio notebook as an application
   * with durable state.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * DeployAsApplicationConfigurationProperty deployAsApplicationConfigurationProperty =
   * DeployAsApplicationConfigurationProperty.builder()
   * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .basePath("basePath")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html)
   */
  public interface DeployAsApplicationConfigurationProperty {
    /**
     * The description of an Amazon S3 object that contains the Amazon Data Analytics application,
     * including the Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that
     * contains the data, and the version number of the Amazon S3 object that contains the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-deployasapplicationconfiguration-s3contentlocation)
     */
    public fun s3ContentLocation(): Any

    /**
     * A builder for [DeployAsApplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon
       * Data Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the
       * name of the Amazon S3 object that contains the data, and the version number of the Amazon S3
       * object that contains the data. 
       */
      public fun s3ContentLocation(s3ContentLocation: IResolvable)

      /**
       * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon
       * Data Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the
       * name of the Amazon S3 object that contains the data, and the version number of the Amazon S3
       * object that contains the data. 
       */
      public fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty)

      /**
       * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon
       * Data Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the
       * name of the Amazon S3 object that contains the data, and the version number of the Amazon S3
       * object that contains the data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580179c7b904c42fc61bfac3acd429505e7efd35244cc4edf50e5602a91223c6")
      public
          fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty.builder()

      /**
       * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon
       * Data Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the
       * name of the Amazon S3 object that contains the data, and the version number of the Amazon S3
       * object that contains the data. 
       */
      override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon
       * Data Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the
       * name of the Amazon S3 object that contains the data, and the version number of the Amazon S3
       * object that contains the data. 
       */
      override fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentBaseLocationProperty.Companion::unwrap))
      }

      /**
       * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon
       * Data Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the
       * name of the Amazon S3 object that contains the data, and the version number of the Amazon S3
       * object that contains the data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580179c7b904c42fc61bfac3acd429505e7efd35244cc4edf50e5602a91223c6")
      override
          fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentBaseLocationProperty(s3ContentLocation))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty,
    ) : CdkObject(cdkObject),
        DeployAsApplicationConfigurationProperty {
      /**
       * The description of an Amazon S3 object that contains the Amazon Data Analytics application,
       * including the Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object
       * that contains the data, and the version number of the Amazon S3 object that contains the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-deployasapplicationconfiguration-s3contentlocation)
       */
      override fun s3ContentLocation(): Any = unwrap(this).getS3ContentLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeployAsApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty):
          DeployAsApplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeployAsApplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeployAsApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty
    }
  }

  /**
   * Describes execution properties for a Managed Service for Apache Flink application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * EnvironmentPropertiesProperty environmentPropertiesProperty =
   * EnvironmentPropertiesProperty.builder()
   * .propertyGroups(List.of(PropertyGroupProperty.builder()
   * .propertyGroupId("propertyGroupId")
   * .propertyMap(Map.of(
   * "propertyMapKey", "propertyMap"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html)
   */
  public interface EnvironmentPropertiesProperty {
    /**
     * Describes the execution property groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups)
     */
    public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    /**
     * A builder for [EnvironmentPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param propertyGroups Describes the execution property groups.
       */
      public fun propertyGroups(propertyGroups: IResolvable)

      /**
       * @param propertyGroups Describes the execution property groups.
       */
      public fun propertyGroups(propertyGroups: List<Any>)

      /**
       * @param propertyGroups Describes the execution property groups.
       */
      public fun propertyGroups(vararg propertyGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty.builder()

      /**
       * @param propertyGroups Describes the execution property groups.
       */
      override fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param propertyGroups Describes the execution property groups.
       */
      override fun propertyGroups(propertyGroups: List<Any>) {
        cdkBuilder.propertyGroups(propertyGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param propertyGroups Describes the execution property groups.
       */
      override fun propertyGroups(vararg propertyGroups: Any): Unit =
          propertyGroups(propertyGroups.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty,
    ) : CdkObject(cdkObject),
        EnvironmentPropertiesProperty {
      /**
       * Describes the execution property groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html#cfn-kinesisanalyticsv2-application-environmentproperties-propertygroups)
       */
      override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty):
          EnvironmentPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentPropertiesProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty
    }
  }

  /**
   * Describes configuration parameters for a Managed Service for Apache Flink application or a
   * Studio notebook.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * FlinkApplicationConfigurationProperty flinkApplicationConfigurationProperty =
   * FlinkApplicationConfigurationProperty.builder()
   * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .checkpointingEnabled(false)
   * .checkpointInterval(123)
   * .minPauseBetweenCheckpoints(123)
   * .build())
   * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .logLevel("logLevel")
   * .metricsLevel("metricsLevel")
   * .build())
   * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .autoScalingEnabled(false)
   * .parallelism(123)
   * .parallelismPerKpu(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html)
   */
  public interface FlinkApplicationConfigurationProperty {
    /**
     * Describes an application's checkpointing configuration.
     *
     * Checkpointing is the process of persisting application state for fault tolerance. For more
     * information, see [Checkpoints for Fault
     * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
     * in the [Apache Flink
     * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-checkpointconfiguration)
     */
    public fun checkpointConfiguration(): Any? = unwrap(this).getCheckpointConfiguration()

    /**
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-monitoringconfiguration)
     */
    public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

    /**
     * Describes parameters for how an application executes multiple tasks simultaneously.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-parallelismconfiguration)
     */
    public fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

    /**
     * A builder for [FlinkApplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param checkpointConfiguration Describes an application's checkpointing configuration.
       * Checkpointing is the process of persisting application state for fault tolerance. For more
       * information, see [Checkpoints for Fault
       * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
       * .
       */
      public fun checkpointConfiguration(checkpointConfiguration: IResolvable)

      /**
       * @param checkpointConfiguration Describes an application's checkpointing configuration.
       * Checkpointing is the process of persisting application state for fault tolerance. For more
       * information, see [Checkpoints for Fault
       * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
       * .
       */
      public fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty)

      /**
       * @param checkpointConfiguration Describes an application's checkpointing configuration.
       * Checkpointing is the process of persisting application state for fault tolerance. For more
       * information, see [Checkpoints for Fault
       * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a2a331f6619f8069b9084e069664e896b4b59ab2b93336622236d8405197e17")
      public
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit)

      /**
       * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
       * logging for an application.
       */
      public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

      /**
       * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
       * logging for an application.
       */
      public fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty)

      /**
       * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
       * logging for an application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e532f8a5880c5916c3384f733593ac86b69511c491c166e839f781f3dedf2a7")
      public
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit)

      /**
       * @param parallelismConfiguration Describes parameters for how an application executes
       * multiple tasks simultaneously.
       */
      public fun parallelismConfiguration(parallelismConfiguration: IResolvable)

      /**
       * @param parallelismConfiguration Describes parameters for how an application executes
       * multiple tasks simultaneously.
       */
      public
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty)

      /**
       * @param parallelismConfiguration Describes parameters for how an application executes
       * multiple tasks simultaneously.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb9e32491e86e72d1101a6d854f2cb99f5e11c95c7415199ba3dec7e059c106")
      public
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty.builder()

      /**
       * @param checkpointConfiguration Describes an application's checkpointing configuration.
       * Checkpointing is the process of persisting application state for fault tolerance. For more
       * information, see [Checkpoints for Fault
       * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
       * .
       */
      override fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param checkpointConfiguration Describes an application's checkpointing configuration.
       * Checkpointing is the process of persisting application state for fault tolerance. For more
       * information, see [Checkpoints for Fault
       * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
       * .
       */
      override
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration.let(CheckpointConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param checkpointConfiguration Describes an application's checkpointing configuration.
       * Checkpointing is the process of persisting application state for fault tolerance. For more
       * information, see [Checkpoints for Fault
       * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a2a331f6619f8069b9084e069664e896b4b59ab2b93336622236d8405197e17")
      override
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit):
          Unit = checkpointConfiguration(CheckpointConfigurationProperty(checkpointConfiguration))

      /**
       * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
       * logging for an application.
       */
      override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
       * logging for an application.
       */
      override
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(MonitoringConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
       * logging for an application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e532f8a5880c5916c3384f733593ac86b69511c491c166e839f781f3dedf2a7")
      override
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit):
          Unit = monitoringConfiguration(MonitoringConfigurationProperty(monitoringConfiguration))

      /**
       * @param parallelismConfiguration Describes parameters for how an application executes
       * multiple tasks simultaneously.
       */
      override fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parallelismConfiguration Describes parameters for how an application executes
       * multiple tasks simultaneously.
       */
      override
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration.let(ParallelismConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param parallelismConfiguration Describes parameters for how an application executes
       * multiple tasks simultaneously.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb9e32491e86e72d1101a6d854f2cb99f5e11c95c7415199ba3dec7e059c106")
      override
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit):
          Unit =
          parallelismConfiguration(ParallelismConfigurationProperty(parallelismConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlinkApplicationConfigurationProperty {
      /**
       * Describes an application's checkpointing configuration.
       *
       * Checkpointing is the process of persisting application state for fault tolerance. For more
       * information, see [Checkpoints for Fault
       * Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
       * in the [Apache Flink
       * Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-checkpointconfiguration)
       */
      override fun checkpointConfiguration(): Any? = unwrap(this).getCheckpointConfiguration()

      /**
       * Describes configuration parameters for Amazon CloudWatch logging for an application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-monitoringconfiguration)
       */
      override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

      /**
       * Describes parameters for how an application executes multiple tasks simultaneously.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-flinkapplicationconfiguration-parallelismconfiguration)
       */
      override fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlinkApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty):
          FlinkApplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlinkApplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlinkApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty
    }
  }

  /**
   * Describes the starting parameters for a Managed Service for Apache Flink application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * FlinkRunConfigurationProperty flinkRunConfigurationProperty =
   * FlinkRunConfigurationProperty.builder()
   * .allowNonRestoredState(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html)
   */
  public interface FlinkRunConfigurationProperty {
    /**
     * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that
     * cannot be mapped to the new program.
     *
     * This will happen if the program is updated between snapshots to remove stateful parameters,
     * and state data in the snapshot no longer corresponds to valid application data. For more
     * information, see [Allowing Non-Restored
     * State](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/savepoints/#allowing-non-restored-state)
     * in the [Apache Flink
     * documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
     * .
     *
     *
     * This value defaults to `false` . If you update your application without specifying this
     * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
     * `true` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html#cfn-kinesisanalyticsv2-application-flinkrunconfiguration-allownonrestoredstate)
     */
    public fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()

    /**
     * A builder for [FlinkRunConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowNonRestoredState When restoring from a snapshot, specifies whether the runtime
       * is allowed to skip a state that cannot be mapped to the new program.
       * This will happen if the program is updated between snapshots to remove stateful parameters,
       * and state data in the snapshot no longer corresponds to valid application data. For more
       * information, see [Allowing Non-Restored
       * State](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/savepoints/#allowing-non-restored-state)
       * in the [Apache Flink
       * documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * This value defaults to `false` . If you update your application without specifying this
       * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
       * `true` .
       */
      public fun allowNonRestoredState(allowNonRestoredState: Boolean)

      /**
       * @param allowNonRestoredState When restoring from a snapshot, specifies whether the runtime
       * is allowed to skip a state that cannot be mapped to the new program.
       * This will happen if the program is updated between snapshots to remove stateful parameters,
       * and state data in the snapshot no longer corresponds to valid application data. For more
       * information, see [Allowing Non-Restored
       * State](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/savepoints/#allowing-non-restored-state)
       * in the [Apache Flink
       * documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * This value defaults to `false` . If you update your application without specifying this
       * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
       * `true` .
       */
      public fun allowNonRestoredState(allowNonRestoredState: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty.builder()

      /**
       * @param allowNonRestoredState When restoring from a snapshot, specifies whether the runtime
       * is allowed to skip a state that cannot be mapped to the new program.
       * This will happen if the program is updated between snapshots to remove stateful parameters,
       * and state data in the snapshot no longer corresponds to valid application data. For more
       * information, see [Allowing Non-Restored
       * State](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/savepoints/#allowing-non-restored-state)
       * in the [Apache Flink
       * documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * This value defaults to `false` . If you update your application without specifying this
       * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
       * `true` .
       */
      override fun allowNonRestoredState(allowNonRestoredState: Boolean) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState)
      }

      /**
       * @param allowNonRestoredState When restoring from a snapshot, specifies whether the runtime
       * is allowed to skip a state that cannot be mapped to the new program.
       * This will happen if the program is updated between snapshots to remove stateful parameters,
       * and state data in the snapshot no longer corresponds to valid application data. For more
       * information, see [Allowing Non-Restored
       * State](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/savepoints/#allowing-non-restored-state)
       * in the [Apache Flink
       * documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * This value defaults to `false` . If you update your application without specifying this
       * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
       * `true` .
       */
      override fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty,
    ) : CdkObject(cdkObject),
        FlinkRunConfigurationProperty {
      /**
       * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state
       * that cannot be mapped to the new program.
       *
       * This will happen if the program is updated between snapshots to remove stateful parameters,
       * and state data in the snapshot no longer corresponds to valid application data. For more
       * information, see [Allowing Non-Restored
       * State](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/ops/state/savepoints/#allowing-non-restored-state)
       * in the [Apache Flink
       * documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master)
       * .
       *
       *
       * This value defaults to `false` . If you update your application without specifying this
       * parameter, `AllowNonRestoredState` will be set to `false` , even if it was previously set to
       * `true` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkrunconfiguration.html#cfn-kinesisanalyticsv2-application-flinkrunconfiguration-allownonrestoredstate)
       */
      override fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FlinkRunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty):
          FlinkRunConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FlinkRunConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlinkRunConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty
    }
  }

  /**
   * The configuration of the Glue Data Catalog that you use for Apache Flink SQL queries and table
   * API transforms that you write in an application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * GlueDataCatalogConfigurationProperty glueDataCatalogConfigurationProperty =
   * GlueDataCatalogConfigurationProperty.builder()
   * .databaseArn("databaseArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html)
   */
  public interface GlueDataCatalogConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html#cfn-kinesisanalyticsv2-application-gluedatacatalogconfiguration-databasearn)
     */
    public fun databaseArn(): String? = unwrap(this).getDatabaseArn()

    /**
     * A builder for [GlueDataCatalogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseArn The Amazon Resource Name (ARN) of the database.
       */
      public fun databaseArn(databaseArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty.builder()

      /**
       * @param databaseArn The Amazon Resource Name (ARN) of the database.
       */
      override fun databaseArn(databaseArn: String) {
        cdkBuilder.databaseArn(databaseArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty,
    ) : CdkObject(cdkObject),
        GlueDataCatalogConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-gluedatacatalogconfiguration.html#cfn-kinesisanalyticsv2-application-gluedatacatalogconfiguration-databasearn)
       */
      override fun databaseArn(): String? = unwrap(this).getDatabaseArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GlueDataCatalogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty):
          GlueDataCatalogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GlueDataCatalogConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueDataCatalogConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty
    }
  }

  /**
   * An object that contains the Amazon Resource Name (ARN) of the Amazon Lambda function that is
   * used to preprocess records in the stream in a SQL-based Kinesis Data Analytics application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * InputLambdaProcessorProperty inputLambdaProcessorProperty =
   * InputLambdaProcessorProperty.builder()
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html)
   */
  public interface InputLambdaProcessorProperty {
    /**
     * The ARN of the Amazon Lambda function that operates on records in the stream.
     *
     *
     * To specify an earlier version of the Lambda function than the latest, include the Lambda
     * function version in the Lambda function ARN. For more information about Lambda ARNs, see
     * [Example ARNs: Amazon
     * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [InputLambdaProcessorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The ARN of the Amazon Lambda function that operates on records in the
       * stream. 
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: Amazon
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty.builder()

      /**
       * @param resourceArn The ARN of the Amazon Lambda function that operates on records in the
       * stream. 
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: Amazon
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty,
    ) : CdkObject(cdkObject),
        InputLambdaProcessorProperty {
      /**
       * The ARN of the Amazon Lambda function that operates on records in the stream.
       *
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: Amazon
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputlambdaprocessor.html#cfn-kinesisanalyticsv2-application-inputlambdaprocessor-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputLambdaProcessorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty):
          InputLambdaProcessorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputLambdaProcessorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLambdaProcessorProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the number of in-application
   * streams to create for a given streaming source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * InputParallelismProperty inputParallelismProperty = InputParallelismProperty.builder()
   * .count(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html)
   */
  public interface InputParallelismProperty {
    /**
     * The number of in-application streams to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html#cfn-kinesisanalyticsv2-application-inputparallelism-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * A builder for [InputParallelismProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count The number of in-application streams to create.
       */
      public fun count(count: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty.builder()

      /**
       * @param count The number of in-application streams to create.
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty,
    ) : CdkObject(cdkObject),
        InputParallelismProperty {
      /**
       * The number of in-application streams to create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html#cfn-kinesisanalyticsv2-application-inputparallelism-count)
       */
      override fun count(): Number? = unwrap(this).getCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputParallelismProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty):
          InputParallelismProperty = CdkObjectWrappers.wrap(cdkObject) as? InputParallelismProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputParallelismProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty
    }
  }

  /**
   * For an SQL-based Amazon Kinesis Data Analytics application, describes a processor that is used
   * to preprocess the records in the stream before being processed by your application code.
   *
   * Currently, the only input processor available is [Amazon
   * Lambda](https://docs.aws.amazon.com/lambda/) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * InputProcessingConfigurationProperty inputProcessingConfigurationProperty =
   * InputProcessingConfigurationProperty.builder()
   * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html)
   */
  public interface InputProcessingConfigurationProperty {
    /**
     * The
     * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
     * that is used to preprocess the records in the stream before being processed by your application
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html#cfn-kinesisanalyticsv2-application-inputprocessingconfiguration-inputlambdaprocessor)
     */
    public fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()

    /**
     * A builder for [InputProcessingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable)

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      public fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty)

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c155289a722c0e860cf6d56ec1447fb77b92e3fa10a1a0ac2de2e0e3d7a0c92")
      public
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty.builder()

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      override fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      override fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(InputLambdaProcessorProperty.Companion::unwrap))
      }

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c155289a722c0e860cf6d56ec1447fb77b92e3fa10a1a0ac2de2e0e3d7a0c92")
      override
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit):
          Unit = inputLambdaProcessor(InputLambdaProcessorProperty(inputLambdaProcessor))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty,
    ) : CdkObject(cdkObject),
        InputProcessingConfigurationProperty {
      /**
       * The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputprocessingconfiguration.html#cfn-kinesisanalyticsv2-application-inputprocessingconfiguration-inputlambdaprocessor)
       */
      override fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InputProcessingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty):
          InputProcessingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputProcessingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProcessingConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty
    }
  }

  /**
   * When you configure the application input for a SQL-based Kinesis Data Analytics application,
   * you specify the streaming source, the in-application stream name that is created, and the mapping
   * between the two.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * InputProperty inputProperty = InputProperty.builder()
   * .inputSchema(InputSchemaProperty.builder()
   * .recordColumns(List.of(RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build()))
   * .recordFormat(RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .recordEncoding("recordEncoding")
   * .build())
   * .namePrefix("namePrefix")
   * // the properties below are optional
   * .inputParallelism(InputParallelismProperty.builder()
   * .count(123)
   * .build())
   * .inputProcessingConfiguration(InputProcessingConfigurationProperty.builder()
   * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .build())
   * .kinesisFirehoseInput(KinesisFirehoseInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .kinesisStreamsInput(KinesisStreamsInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html)
   */
  public interface InputProperty {
    /**
     * Describes the number of in-application streams to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputparallelism)
     */
    public fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

    /**
     * The
     * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
     * for the input. An input processor transforms records as they are received from the stream,
     * before the application's SQL code executes. Currently, the only input processing configuration
     * available is
     * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputprocessingconfiguration)
     */
    public fun inputProcessingConfiguration(): Any? = unwrap(this).getInputProcessingConfiguration()

    /**
     * Describes the format of the data in the streaming source, and how each data element maps to
     * corresponding columns in the in-application stream that is being created.
     *
     * Also used to describe the format of the reference data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputschema)
     */
    public fun inputSchema(): Any

    /**
     * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies the
     * delivery stream's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisfirehoseinput)
     */
    public fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

    /**
     * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon
     * Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisstreamsinput)
     */
    public fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

    /**
     * The name prefix to use when creating an in-application stream.
     *
     * Suppose that you specify a prefix " `MyInApplicationStream` ." Kinesis Data Analytics then
     * creates one or more (as per the `InputParallelism` count you specified) in-application streams
     * with the names " `MyInApplicationStream_001` ," " `MyInApplicationStream_002` ," and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix)
     */
    public fun namePrefix(): String

    /**
     * A builder for [InputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       */
      public fun inputParallelism(inputParallelism: IResolvable)

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       */
      public fun inputParallelism(inputParallelism: InputParallelismProperty)

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d358a4757b53b52c0a56de1610bfe3f2518772e204dbdbc284f429f33846e7a")
      public fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit)

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * .
       */
      public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable)

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * .
       */
      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty)

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e819e00e49bbb2bdc99afd71d723e214ebf1b85326cff1bb84c74f99f14d60e")
      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      public fun inputSchema(inputSchema: IResolvable)

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      public fun inputSchema(inputSchema: InputSchemaProperty)

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21d2f3230c8f83ad2f05a35f7220f3b5108af69c7115b09a7e84cf8bccaa588b")
      public fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit)

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data Firehose
       * delivery stream, identifies the delivery stream's ARN.
       */
      public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable)

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data Firehose
       * delivery stream, identifies the delivery stream's ARN.
       */
      public fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty)

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data Firehose
       * delivery stream, identifies the delivery stream's ARN.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("714df90655acbc368ff411c8a1ec1bf75d1e22c1241a110189319829987a3de6")
      public
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit)

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
       * identifies the stream's Amazon Resource Name (ARN).
       */
      public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable)

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
       * identifies the stream's Amazon Resource Name (ARN).
       */
      public fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty)

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
       * identifies the stream's Amazon Resource Name (ARN).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3036a9164b1a21b787b267d25c78ce94751d7a52985705e8b7199a63daef428")
      public
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit)

      /**
       * @param namePrefix The name prefix to use when creating an in-application stream. 
       * Suppose that you specify a prefix " `MyInApplicationStream` ." Kinesis Data Analytics then
       * creates one or more (as per the `InputParallelism` count you specified) in-application streams
       * with the names " `MyInApplicationStream_001` ," " `MyInApplicationStream_002` ," and so on.
       */
      public fun namePrefix(namePrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty.Builder =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty.builder()

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       */
      override fun inputParallelism(inputParallelism: IResolvable) {
        cdkBuilder.inputParallelism(inputParallelism.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       */
      override fun inputParallelism(inputParallelism: InputParallelismProperty) {
        cdkBuilder.inputParallelism(inputParallelism.let(InputParallelismProperty.Companion::unwrap))
      }

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d358a4757b53b52c0a56de1610bfe3f2518772e204dbdbc284f429f33846e7a")
      override fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit):
          Unit = inputParallelism(InputParallelismProperty(inputParallelism))

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * .
       */
      override fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * .
       */
      override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(InputProcessingConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e819e00e49bbb2bdc99afd71d723e214ebf1b85326cff1bb84c74f99f14d60e")
      override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit):
          Unit =
          inputProcessingConfiguration(InputProcessingConfigurationProperty(inputProcessingConfiguration))

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      override fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      override fun inputSchema(inputSchema: InputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema.let(InputSchemaProperty.Companion::unwrap))
      }

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21d2f3230c8f83ad2f05a35f7220f3b5108af69c7115b09a7e84cf8bccaa588b")
      override fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit): Unit =
          inputSchema(InputSchemaProperty(inputSchema))

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data Firehose
       * delivery stream, identifies the delivery stream's ARN.
       */
      override fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data Firehose
       * delivery stream, identifies the delivery stream's ARN.
       */
      override fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(KinesisFirehoseInputProperty.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Data Firehose
       * delivery stream, identifies the delivery stream's ARN.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("714df90655acbc368ff411c8a1ec1bf75d1e22c1241a110189319829987a3de6")
      override
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseInput(KinesisFirehoseInputProperty(kinesisFirehoseInput))

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
       * identifies the stream's Amazon Resource Name (ARN).
       */
      override fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
       * identifies the stream's Amazon Resource Name (ARN).
       */
      override fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(KinesisStreamsInputProperty.Companion::unwrap))
      }

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis data stream,
       * identifies the stream's Amazon Resource Name (ARN).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3036a9164b1a21b787b267d25c78ce94751d7a52985705e8b7199a63daef428")
      override
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsInput(KinesisStreamsInputProperty(kinesisStreamsInput))

      /**
       * @param namePrefix The name prefix to use when creating an in-application stream. 
       * Suppose that you specify a prefix " `MyInApplicationStream` ." Kinesis Data Analytics then
       * creates one or more (as per the `InputParallelism` count you specified) in-application streams
       * with the names " `MyInApplicationStream_001` ," " `MyInApplicationStream_002` ," and so on.
       */
      override fun namePrefix(namePrefix: String) {
        cdkBuilder.namePrefix(namePrefix)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty,
    ) : CdkObject(cdkObject),
        InputProperty {
      /**
       * Describes the number of in-application streams to create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputparallelism)
       */
      override fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

      /**
       * The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputProcessingConfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_InputLambdaProcessor.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputprocessingconfiguration)
       */
      override fun inputProcessingConfiguration(): Any? =
          unwrap(this).getInputProcessingConfiguration()

      /**
       * Describes the format of the data in the streaming source, and how each data element maps to
       * corresponding columns in the in-application stream that is being created.
       *
       * Also used to describe the format of the reference data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-inputschema)
       */
      override fun inputSchema(): Any = unwrap(this).getInputSchema()

      /**
       * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies the
       * delivery stream's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisfirehoseinput)
       */
      override fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

      /**
       * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon
       * Resource Name (ARN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-kinesisstreamsinput)
       */
      override fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

      /**
       * The name prefix to use when creating an in-application stream.
       *
       * Suppose that you specify a prefix " `MyInApplicationStream` ." Kinesis Data Analytics then
       * creates one or more (as per the `InputParallelism` count you specified) in-application streams
       * with the names " `MyInApplicationStream_001` ," " `MyInApplicationStream_002` ," and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-input.html#cfn-kinesisanalyticsv2-application-input-nameprefix)
       */
      override fun namePrefix(): String = unwrap(this).getNamePrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty):
          InputProperty = CdkObjectWrappers.wrap(cdkObject) as? InputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the format of the data in the
   * streaming source, and how each data element maps to corresponding columns created in the
   * in-application stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * InputSchemaProperty inputSchemaProperty = InputSchemaProperty.builder()
   * .recordColumns(List.of(RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build()))
   * .recordFormat(RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .recordEncoding("recordEncoding")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html)
   */
  public interface InputSchemaProperty {
    /**
     * A list of `RecordColumn` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns)
     */
    public fun recordColumns(): Any

    /**
     * Specifies the encoding of the records in the streaming source.
     *
     * For example, UTF-8.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding)
     */
    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    /**
     * Specifies the format of the records on the streaming source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordformat)
     */
    public fun recordFormat(): Any

    /**
     * A builder for [InputSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(recordColumns: IResolvable)

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(recordColumns: List<Any>)

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(vararg recordColumns: Any)

      /**
       * @param recordEncoding Specifies the encoding of the records in the streaming source.
       * For example, UTF-8.
       */
      public fun recordEncoding(recordEncoding: String)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      public fun recordFormat(recordFormat: IResolvable)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      public fun recordFormat(recordFormat: RecordFormatProperty)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64ed657f2df6f0e64c7bd7a4fbe51d08c3695dd141047541bbcf001ef84df8ce")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty.builder()

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(vararg recordColumns: Any): Unit =
          recordColumns(recordColumns.toList())

      /**
       * @param recordEncoding Specifies the encoding of the records in the streaming source.
       * For example, UTF-8.
       */
      override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty.Companion::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64ed657f2df6f0e64c7bd7a4fbe51d08c3695dd141047541bbcf001ef84df8ce")
      override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit =
          recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty,
    ) : CdkObject(cdkObject),
        InputSchemaProperty {
      /**
       * A list of `RecordColumn` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns)
       */
      override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      /**
       * Specifies the encoding of the records in the streaming source.
       *
       * For example, UTF-8.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding)
       */
      override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      /**
       * Specifies the format of the records on the streaming source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordformat)
       */
      override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty):
          InputSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? InputSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSchemaProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
   * when JSON is the record format on the streaming source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * JSONMappingParametersProperty jSONMappingParametersProperty =
   * JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html)
   */
  public interface JSONMappingParametersProperty {
    /**
     * The path to the top-level parent that contains the records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html#cfn-kinesisanalyticsv2-application-jsonmappingparameters-recordrowpath)
     */
    public fun recordRowPath(): String

    /**
     * A builder for [JSONMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordRowPath The path to the top-level parent that contains the records. 
       */
      public fun recordRowPath(recordRowPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty.builder()

      /**
       * @param recordRowPath The path to the top-level parent that contains the records. 
       */
      override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty,
    ) : CdkObject(cdkObject),
        JSONMappingParametersProperty {
      /**
       * The path to the top-level parent that contains the records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-jsonmappingparameters.html#cfn-kinesisanalyticsv2-application-jsonmappingparameters-recordrowpath)
       */
      override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty):
          JSONMappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JSONMappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, identifies a Kinesis Data Firehose delivery
   * stream as the streaming source.
   *
   * You provide the delivery stream's Amazon Resource Name (ARN).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * KinesisFirehoseInputProperty kinesisFirehoseInputProperty =
   * KinesisFirehoseInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html)
   */
  public interface KinesisFirehoseInputProperty {
    /**
     * The Amazon Resource Name (ARN) of the delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html#cfn-kinesisanalyticsv2-application-kinesisfirehoseinput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [KinesisFirehoseInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. 
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty.builder()

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty,
    ) : CdkObject(cdkObject),
        KinesisFirehoseInputProperty {
      /**
       * The Amazon Resource Name (ARN) of the delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html#cfn-kinesisanalyticsv2-application-kinesisfirehoseinput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty):
          KinesisFirehoseInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisFirehoseInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseInputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty
    }
  }

  /**
   * Identifies a Kinesis data stream as the streaming source.
   *
   * You provide the stream's Amazon Resource Name (ARN).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * KinesisStreamsInputProperty kinesisStreamsInputProperty = KinesisStreamsInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html)
   */
  public interface KinesisStreamsInputProperty {
    /**
     * The ARN of the input Kinesis data stream to read.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html#cfn-kinesisanalyticsv2-application-kinesisstreamsinput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [KinesisStreamsInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The ARN of the input Kinesis data stream to read. 
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty.builder()

      /**
       * @param resourceArn The ARN of the input Kinesis data stream to read. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty,
    ) : CdkObject(cdkObject),
        KinesisStreamsInputProperty {
      /**
       * The ARN of the input Kinesis data stream to read.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html#cfn-kinesisanalyticsv2-application-kinesisstreamsinput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty):
          KinesisStreamsInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisStreamsInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsInputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty
    }
  }

  /**
   * When you configure a SQL-based Kinesis Data Analytics application's input at the time of
   * creating or updating an application, provides additional mapping information specific to the
   * record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming
   * source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * MappingParametersProperty mappingParametersProperty = MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html)
   */
  public interface MappingParametersProperty {
    /**
     * Provides additional mapping information when the record format uses delimiters (for example,
     * CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-csvmappingparameters)
     */
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    /**
     * Provides additional mapping information when JSON is the record format on the streaming
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-jsonmappingparameters)
     */
    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    /**
     * A builder for [MappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      public fun csvMappingParameters(csvMappingParameters: IResolvable)

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty)

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06dc982ddf45b0ed881b41b491fe398268ae0efb1fa0c934e05fee437ae3864c")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      public fun jsonMappingParameters(jsonMappingParameters: IResolvable)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50204536ef00d6390153a15741f4f89590b33a86e1ca38ab8e86557b0da64f9b")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty.builder()

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty.Companion::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06dc982ddf45b0ed881b41b491fe398268ae0efb1fa0c934e05fee437ae3864c")
      override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty.Companion::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50204536ef00d6390153a15741f4f89590b33a86e1ca38ab8e86557b0da64f9b")
      override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty,
    ) : CdkObject(cdkObject),
        MappingParametersProperty {
      /**
       * Provides additional mapping information when the record format uses delimiters (for
       * example, CSV).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-csvmappingparameters)
       */
      override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      /**
       * Provides additional mapping information when JSON is the record format on the streaming
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mappingparameters.html#cfn-kinesisanalyticsv2-application-mappingparameters-jsonmappingparameters)
       */
      override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty):
          MappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty
    }
  }

  /**
   * The information required to specify a Maven reference.
   *
   * You can use Maven references to specify dependency JAR files.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * MavenReferenceProperty mavenReferenceProperty = MavenReferenceProperty.builder()
   * .artifactId("artifactId")
   * .groupId("groupId")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html)
   */
  public interface MavenReferenceProperty {
    /**
     * The artifact ID of the Maven reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-artifactid)
     */
    public fun artifactId(): String

    /**
     * The group ID of the Maven reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-groupid)
     */
    public fun groupId(): String

    /**
     * The version of the Maven reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-version)
     */
    public fun version(): String

    /**
     * A builder for [MavenReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifactId The artifact ID of the Maven reference. 
       */
      public fun artifactId(artifactId: String)

      /**
       * @param groupId The group ID of the Maven reference. 
       */
      public fun groupId(groupId: String)

      /**
       * @param version The version of the Maven reference. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty.builder()

      /**
       * @param artifactId The artifact ID of the Maven reference. 
       */
      override fun artifactId(artifactId: String) {
        cdkBuilder.artifactId(artifactId)
      }

      /**
       * @param groupId The group ID of the Maven reference. 
       */
      override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      /**
       * @param version The version of the Maven reference. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty,
    ) : CdkObject(cdkObject),
        MavenReferenceProperty {
      /**
       * The artifact ID of the Maven reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-artifactid)
       */
      override fun artifactId(): String = unwrap(this).getArtifactId()

      /**
       * The group ID of the Maven reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-groupid)
       */
      override fun groupId(): String = unwrap(this).getGroupId()

      /**
       * The version of the Maven reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html#cfn-kinesisanalyticsv2-application-mavenreference-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MavenReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty):
          MavenReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as? MavenReferenceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MavenReferenceProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty
    }
  }

  /**
   * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data
   * Analytics application.
   *
   * For more information about CloudWatch logging, see
   * [Monitoring](https://docs.aws.amazon.com/managed-flink/latest/java/monitoring-overview) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * MonitoringConfigurationProperty monitoringConfigurationProperty =
   * MonitoringConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .logLevel("logLevel")
   * .metricsLevel("metricsLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html)
   */
  public interface MonitoringConfigurationProperty {
    /**
     * Describes whether to use the default CloudWatch logging configuration for an application.
     *
     * You must set this property to `CUSTOM` in order to set the `LogLevel` or `MetricsLevel`
     * parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype)
     */
    public fun configurationType(): String

    /**
     * Describes the verbosity of the CloudWatch Logs for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel)
     */
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * Describes the granularity of the CloudWatch Logs for an application.
     *
     * The `Parallelism` level is not recommended for applications with a Parallelism over 64 due to
     * excessive costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel)
     */
    public fun metricsLevel(): String? = unwrap(this).getMetricsLevel()

    /**
     * A builder for [MonitoringConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configurationType Describes whether to use the default CloudWatch logging
       * configuration for an application. 
       * You must set this property to `CUSTOM` in order to set the `LogLevel` or `MetricsLevel`
       * parameters.
       */
      public fun configurationType(configurationType: String)

      /**
       * @param logLevel Describes the verbosity of the CloudWatch Logs for an application.
       */
      public fun logLevel(logLevel: String)

      /**
       * @param metricsLevel Describes the granularity of the CloudWatch Logs for an application.
       * The `Parallelism` level is not recommended for applications with a Parallelism over 64 due
       * to excessive costs.
       */
      public fun metricsLevel(metricsLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty.builder()

      /**
       * @param configurationType Describes whether to use the default CloudWatch logging
       * configuration for an application. 
       * You must set this property to `CUSTOM` in order to set the `LogLevel` or `MetricsLevel`
       * parameters.
       */
      override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      /**
       * @param logLevel Describes the verbosity of the CloudWatch Logs for an application.
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      /**
       * @param metricsLevel Describes the granularity of the CloudWatch Logs for an application.
       * The `Parallelism` level is not recommended for applications with a Parallelism over 64 due
       * to excessive costs.
       */
      override fun metricsLevel(metricsLevel: String) {
        cdkBuilder.metricsLevel(metricsLevel)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty,
    ) : CdkObject(cdkObject),
        MonitoringConfigurationProperty {
      /**
       * Describes whether to use the default CloudWatch logging configuration for an application.
       *
       * You must set this property to `CUSTOM` in order to set the `LogLevel` or `MetricsLevel`
       * parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-configurationtype)
       */
      override fun configurationType(): String = unwrap(this).getConfigurationType()

      /**
       * Describes the verbosity of the CloudWatch Logs for an application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-loglevel)
       */
      override fun logLevel(): String? = unwrap(this).getLogLevel()

      /**
       * Describes the granularity of the CloudWatch Logs for an application.
       *
       * The `Parallelism` level is not recommended for applications with a Parallelism over 64 due
       * to excessive costs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-monitoringconfiguration.html#cfn-kinesisanalyticsv2-application-monitoringconfiguration-metricslevel)
       */
      override fun metricsLevel(): String? = unwrap(this).getMetricsLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty):
          MonitoringConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MonitoringConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty
    }
  }

  /**
   * Describes parameters for how a Flink-based Kinesis Data Analytics application executes multiple
   * tasks simultaneously.
   *
   * For more information about parallelism, see [Parallel
   * Execution](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master/docs/dev/datastream/execution/parallel/)
   * in the [Apache Flink
   * Documentation](https://docs.aws.amazon.com/https://nightlies.apache.org/flink/flink-docs-master) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ParallelismConfigurationProperty parallelismConfigurationProperty =
   * ParallelismConfigurationProperty.builder()
   * .configurationType("configurationType")
   * // the properties below are optional
   * .autoScalingEnabled(false)
   * .parallelism(123)
   * .parallelismPerKpu(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html)
   */
  public interface ParallelismConfigurationProperty {
    /**
     * Describes whether the Managed Service for Apache Flink service can increase the parallelism
     * of the application in response to increased throughput.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled)
     */
    public fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

    /**
     * Describes whether the application uses the default parallelism for the Managed Service for
     * Apache Flink service.
     *
     * You must set this property to `CUSTOM` in order to change your application's
     * `AutoScalingEnabled` , `Parallelism` , or `ParallelismPerKPU` properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype)
     */
    public fun configurationType(): String

    /**
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics
     * application can perform.
     *
     * The Kinesis Data Analytics service can increase this number automatically if
     * [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
     * is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism)
     */
    public fun parallelism(): Number? = unwrap(this).getParallelism()

    /**
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application
     * can perform per Kinesis Processing Unit (KPU) used by the application.
     *
     * For more information about KPUs, see [Amazon Kinesis Data Analytics
     * Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu)
     */
    public fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()

    /**
     * A builder for [ParallelismConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink service
       * can increase the parallelism of the application in response to increased throughput.
       */
      public fun autoScalingEnabled(autoScalingEnabled: Boolean)

      /**
       * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink service
       * can increase the parallelism of the application in response to increased throughput.
       */
      public fun autoScalingEnabled(autoScalingEnabled: IResolvable)

      /**
       * @param configurationType Describes whether the application uses the default parallelism for
       * the Managed Service for Apache Flink service. 
       * You must set this property to `CUSTOM` in order to change your application's
       * `AutoScalingEnabled` , `Parallelism` , or `ParallelismPerKPU` properties.
       */
      public fun configurationType(configurationType: String)

      /**
       * @param parallelism Describes the initial number of parallel tasks that a Java-based Kinesis
       * Data Analytics application can perform.
       * The Kinesis Data Analytics service can increase this number automatically if
       * [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
       * is set to `true` .
       */
      public fun parallelism(parallelism: Number)

      /**
       * @param parallelismPerKpu Describes the number of parallel tasks that a Java-based Kinesis
       * Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the
       * application.
       * For more information about KPUs, see [Amazon Kinesis Data Analytics
       * Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/) .
       */
      public fun parallelismPerKpu(parallelismPerKpu: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty.builder()

      /**
       * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink service
       * can increase the parallelism of the application in response to increased throughput.
       */
      override fun autoScalingEnabled(autoScalingEnabled: Boolean) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled)
      }

      /**
       * @param autoScalingEnabled Describes whether the Managed Service for Apache Flink service
       * can increase the parallelism of the application in response to increased throughput.
       */
      override fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param configurationType Describes whether the application uses the default parallelism for
       * the Managed Service for Apache Flink service. 
       * You must set this property to `CUSTOM` in order to change your application's
       * `AutoScalingEnabled` , `Parallelism` , or `ParallelismPerKPU` properties.
       */
      override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      /**
       * @param parallelism Describes the initial number of parallel tasks that a Java-based Kinesis
       * Data Analytics application can perform.
       * The Kinesis Data Analytics service can increase this number automatically if
       * [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
       * is set to `true` .
       */
      override fun parallelism(parallelism: Number) {
        cdkBuilder.parallelism(parallelism)
      }

      /**
       * @param parallelismPerKpu Describes the number of parallel tasks that a Java-based Kinesis
       * Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the
       * application.
       * For more information about KPUs, see [Amazon Kinesis Data Analytics
       * Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/) .
       */
      override fun parallelismPerKpu(parallelismPerKpu: Number) {
        cdkBuilder.parallelismPerKpu(parallelismPerKpu)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty,
    ) : CdkObject(cdkObject),
        ParallelismConfigurationProperty {
      /**
       * Describes whether the Managed Service for Apache Flink service can increase the parallelism
       * of the application in response to increased throughput.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-autoscalingenabled)
       */
      override fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

      /**
       * Describes whether the application uses the default parallelism for the Managed Service for
       * Apache Flink service.
       *
       * You must set this property to `CUSTOM` in order to change your application's
       * `AutoScalingEnabled` , `Parallelism` , or `ParallelismPerKPU` properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-configurationtype)
       */
      override fun configurationType(): String = unwrap(this).getConfigurationType()

      /**
       * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics
       * application can perform.
       *
       * The Kinesis Data Analytics service can increase this number automatically if
       * [ParallelismConfiguration:AutoScalingEnabled](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_ParallelismConfiguration.html#kinesisanalytics-Type-ParallelismConfiguration-AutoScalingEnabled.html)
       * is set to `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelism)
       */
      override fun parallelism(): Number? = unwrap(this).getParallelism()

      /**
       * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application
       * can perform per Kinesis Processing Unit (KPU) used by the application.
       *
       * For more information about KPUs, see [Amazon Kinesis Data Analytics
       * Pricing](https://docs.aws.amazon.com/kinesis/data-analytics/pricing/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-parallelismconfiguration.html#cfn-kinesisanalyticsv2-application-parallelismconfiguration-parallelismperkpu)
       */
      override fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParallelismConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty):
          ParallelismConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParallelismConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParallelismConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty
    }
  }

  /**
   * Property key-value pairs passed into an application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
   * .propertyGroupId("propertyGroupId")
   * .propertyMap(Map.of(
   * "propertyMapKey", "propertyMap"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html)
   */
  public interface PropertyGroupProperty {
    /**
     * Describes the key of an application execution property key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid)
     */
    public fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

    /**
     * Describes the value of an application execution property key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap)
     */
    public fun propertyMap(): Any? = unwrap(this).getPropertyMap()

    /**
     * A builder for [PropertyGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param propertyGroupId Describes the key of an application execution property key-value
       * pair.
       */
      public fun propertyGroupId(propertyGroupId: String)

      /**
       * @param propertyMap Describes the value of an application execution property key-value pair.
       */
      public fun propertyMap(propertyMap: Map<String, String>)

      /**
       * @param propertyMap Describes the value of an application execution property key-value pair.
       */
      public fun propertyMap(propertyMap: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty.builder()

      /**
       * @param propertyGroupId Describes the key of an application execution property key-value
       * pair.
       */
      override fun propertyGroupId(propertyGroupId: String) {
        cdkBuilder.propertyGroupId(propertyGroupId)
      }

      /**
       * @param propertyMap Describes the value of an application execution property key-value pair.
       */
      override fun propertyMap(propertyMap: Map<String, String>) {
        cdkBuilder.propertyMap(propertyMap)
      }

      /**
       * @param propertyMap Describes the value of an application execution property key-value pair.
       */
      override fun propertyMap(propertyMap: IResolvable) {
        cdkBuilder.propertyMap(propertyMap.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty,
    ) : CdkObject(cdkObject),
        PropertyGroupProperty {
      /**
       * Describes the key of an application execution property key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertygroupid)
       */
      override fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

      /**
       * Describes the value of an application execution property key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-propertygroup.html#cfn-kinesisanalyticsv2-application-propertygroup-propertymap)
       */
      override fun propertyMap(): Any? = unwrap(this).getPropertyMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty):
          PropertyGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? PropertyGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyGroupProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the mapping of each data element
   * in the streaming source to the corresponding column in the in-application stream.
   *
   * Also used to describe the format of the reference data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html)
   */
  public interface RecordColumnProperty {
    /**
     * A reference to the data element in the streaming input or the reference data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-mapping)
     */
    public fun mapping(): String? = unwrap(this).getMapping()

    /**
     * The name of the column that is created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-name)
     */
    public fun name(): String

    /**
     * The type of column created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-sqltype)
     */
    public fun sqlType(): String

    /**
     * A builder for [RecordColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mapping A reference to the data element in the streaming input or the reference data
       * source.
       */
      public fun mapping(mapping: String)

      /**
       * @param name The name of the column that is created in the in-application input stream or
       * reference table. 
       */
      public fun name(name: String)

      /**
       * @param sqlType The type of column created in the in-application input stream or reference
       * table. 
       */
      public fun sqlType(sqlType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty.builder()

      /**
       * @param mapping A reference to the data element in the streaming input or the reference data
       * source.
       */
      override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      /**
       * @param name The name of the column that is created in the in-application input stream or
       * reference table. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sqlType The type of column created in the in-application input stream or reference
       * table. 
       */
      override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty,
    ) : CdkObject(cdkObject),
        RecordColumnProperty {
      /**
       * A reference to the data element in the streaming input or the reference data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-mapping)
       */
      override fun mapping(): String? = unwrap(this).getMapping()

      /**
       * The name of the column that is created in the in-application input stream or reference
       * table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of column created in the in-application input stream or reference table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordcolumn.html#cfn-kinesisanalyticsv2-application-recordcolumn-sqltype)
       */
      override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty):
          RecordColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the record format and relevant
   * mapping information that should be applied to schematize the records on the stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html)
   */
  public interface RecordFormatProperty {
    /**
     * When you configure application input at the time of creating or updating an application,
     * provides additional mapping information specific to the record format (such as JSON, CSV, or
     * record fields delimited by some delimiter) on the streaming source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-mappingparameters)
     */
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    /**
     * The type of record format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype)
     */
    public fun recordFormatType(): String

    /**
     * A builder for [RecordFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: IResolvable)

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: MappingParametersProperty)

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ecd3fdb498eb8bf2feb547186492adc0e784e47e8a01c2832653953230ea7c5")
      public fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit)

      /**
       * @param recordFormatType The type of record format. 
       */
      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty.builder()

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty.Companion::unwrap))
      }

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ecd3fdb498eb8bf2feb547186492adc0e784e47e8a01c2832653953230ea7c5")
      override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      /**
       * @param recordFormatType The type of record format. 
       */
      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty,
    ) : CdkObject(cdkObject),
        RecordFormatProperty {
      /**
       * When you configure application input at the time of creating or updating an application,
       * provides additional mapping information specific to the record format (such as JSON, CSV, or
       * record fields delimited by some delimiter) on the streaming source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-mappingparameters)
       */
      override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      /**
       * The type of record format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype)
       */
      override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty):
          RecordFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty
    }
  }

  /**
   * Describes the starting parameters for an Managed Service for Apache Flink application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * RunConfigurationProperty runConfigurationProperty = RunConfigurationProperty.builder()
   * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
   * .applicationRestoreType("applicationRestoreType")
   * // the properties below are optional
   * .snapshotName("snapshotName")
   * .build())
   * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
   * .allowNonRestoredState(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html)
   */
  public interface RunConfigurationProperty {
    /**
     * Describes the restore behavior of a restarting application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-applicationrestoreconfiguration)
     */
    public fun applicationRestoreConfiguration(): Any? =
        unwrap(this).getApplicationRestoreConfiguration()

    /**
     * Describes the starting parameters for a Managed Service for Apache Flink application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-flinkrunconfiguration)
     */
    public fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()

    /**
     * A builder for [RunConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
       * application.
       */
      public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable)

      /**
       * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
       * application.
       */
      public
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty)

      /**
       * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
       * application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc332ff3262127040a2c64e17e89c17dad48d5e3c70d84a6c089c7a91480d72")
      public
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty.Builder.() -> Unit)

      /**
       * @param flinkRunConfiguration Describes the starting parameters for a Managed Service for
       * Apache Flink application.
       */
      public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable)

      /**
       * @param flinkRunConfiguration Describes the starting parameters for a Managed Service for
       * Apache Flink application.
       */
      public fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty)

      /**
       * @param flinkRunConfiguration Describes the starting parameters for a Managed Service for
       * Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a17668293e15c33da2c8cb7c874cb87cff2921c78d503506efab10959b7cdc8a")
      public
          fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty.builder()

      /**
       * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
       * application.
       */
      override fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
       * application.
       */
      override
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration.let(ApplicationRestoreConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
       * application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc332ff3262127040a2c64e17e89c17dad48d5e3c70d84a6c089c7a91480d72")
      override
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty(applicationRestoreConfiguration))

      /**
       * @param flinkRunConfiguration Describes the starting parameters for a Managed Service for
       * Apache Flink application.
       */
      override fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param flinkRunConfiguration Describes the starting parameters for a Managed Service for
       * Apache Flink application.
       */
      override fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration.let(FlinkRunConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param flinkRunConfiguration Describes the starting parameters for a Managed Service for
       * Apache Flink application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a17668293e15c33da2c8cb7c874cb87cff2921c78d503506efab10959b7cdc8a")
      override
          fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit):
          Unit = flinkRunConfiguration(FlinkRunConfigurationProperty(flinkRunConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty,
    ) : CdkObject(cdkObject),
        RunConfigurationProperty {
      /**
       * Describes the restore behavior of a restarting application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-applicationrestoreconfiguration)
       */
      override fun applicationRestoreConfiguration(): Any? =
          unwrap(this).getApplicationRestoreConfiguration()

      /**
       * Describes the starting parameters for a Managed Service for Apache Flink application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html#cfn-kinesisanalyticsv2-application-runconfiguration-flinkrunconfiguration)
       */
      override fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty):
          RunConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? RunConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty
    }
  }

  /**
   * The base location of the Amazon Data Analytics application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * S3ContentBaseLocationProperty s3ContentBaseLocationProperty =
   * S3ContentBaseLocationProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .basePath("basePath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html)
   */
  public interface S3ContentBaseLocationProperty {
    /**
     * The base path for the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-basepath)
     */
    public fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The Amazon Resource Name (ARN) of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * A builder for [S3ContentBaseLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basePath The base path for the S3 bucket.
       */
      public fun basePath(basePath: String)

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. 
       */
      public fun bucketArn(bucketArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty.builder()

      /**
       * @param basePath The base path for the S3 bucket.
       */
      override fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
      }

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty,
    ) : CdkObject(cdkObject),
        S3ContentBaseLocationProperty {
      /**
       * The base path for the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-basepath)
       */
      override fun basePath(): String? = unwrap(this).getBasePath()

      /**
       * The Amazon Resource Name (ARN) of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentbaselocation.html#cfn-kinesisanalyticsv2-application-s3contentbaselocation-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ContentBaseLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty):
          S3ContentBaseLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3ContentBaseLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ContentBaseLocationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty
    }
  }

  /**
   * The location of an application or a custom artifact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * S3ContentLocationProperty s3ContentLocationProperty = S3ContentLocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html)
   */
  public interface S3ContentLocationProperty {
    /**
     * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * The file key for the object containing the application code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey)
     */
    public fun fileKey(): String

    /**
     * The version of the object containing the application code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion)
     */
    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /**
     * A builder for [S3ContentLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The Amazon Resource Name (ARN) for the S3 bucket containing the
       * application code. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param fileKey The file key for the object containing the application code. 
       */
      public fun fileKey(fileKey: String)

      /**
       * @param objectVersion The version of the object containing the application code.
       */
      public fun objectVersion(objectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty.builder()

      /**
       * @param bucketArn The Amazon Resource Name (ARN) for the S3 bucket containing the
       * application code. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param fileKey The file key for the object containing the application code. 
       */
      override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      /**
       * @param objectVersion The version of the object containing the application code.
       */
      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty,
    ) : CdkObject(cdkObject),
        S3ContentLocationProperty {
      /**
       * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * The file key for the object containing the application code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey)
       */
      override fun fileKey(): String = unwrap(this).getFileKey()

      /**
       * The version of the object containing the application code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion)
       */
      override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ContentLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty):
          S3ContentLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3ContentLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ContentLocationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty
    }
  }

  /**
   * Describes the inputs, outputs, and reference data sources for a SQL-based Kinesis Data
   * Analytics application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * SqlApplicationConfigurationProperty sqlApplicationConfigurationProperty =
   * SqlApplicationConfigurationProperty.builder()
   * .inputs(List.of(InputProperty.builder()
   * .inputSchema(InputSchemaProperty.builder()
   * .recordColumns(List.of(RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build()))
   * .recordFormat(RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .recordEncoding("recordEncoding")
   * .build())
   * .namePrefix("namePrefix")
   * // the properties below are optional
   * .inputParallelism(InputParallelismProperty.builder()
   * .count(123)
   * .build())
   * .inputProcessingConfiguration(InputProcessingConfigurationProperty.builder()
   * .inputLambdaProcessor(InputLambdaProcessorProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .build())
   * .kinesisFirehoseInput(KinesisFirehoseInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .kinesisStreamsInput(KinesisStreamsInputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html)
   */
  public interface SqlApplicationConfigurationProperty {
    /**
     * The array of [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
     * objects describing the input streams used by the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs)
     */
    public fun inputs(): Any? = unwrap(this).getInputs()

    /**
     * A builder for [SqlApplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputs The array of
       * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html) objects
       * describing the input streams used by the application.
       */
      public fun inputs(inputs: IResolvable)

      /**
       * @param inputs The array of
       * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html) objects
       * describing the input streams used by the application.
       */
      public fun inputs(inputs: List<Any>)

      /**
       * @param inputs The array of
       * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html) objects
       * describing the input streams used by the application.
       */
      public fun inputs(vararg inputs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty.builder()

      /**
       * @param inputs The array of
       * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html) objects
       * describing the input streams used by the application.
       */
      override fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputs The array of
       * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html) objects
       * describing the input streams used by the application.
       */
      override fun inputs(inputs: List<Any>) {
        cdkBuilder.inputs(inputs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputs The array of
       * [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html) objects
       * describing the input streams used by the application.
       */
      override fun inputs(vararg inputs: Any): Unit = inputs(inputs.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty,
    ) : CdkObject(cdkObject),
        SqlApplicationConfigurationProperty {
      /**
       * The array of [Input](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_Input.html)
       * objects describing the input streams used by the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-sqlapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-sqlapplicationconfiguration-inputs)
       */
      override fun inputs(): Any? = unwrap(this).getInputs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SqlApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty):
          SqlApplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SqlApplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty
    }
  }

  /**
   * Describes the parameters of a VPC used by the application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html)
   */
  public interface VpcConfigurationProperty {
    /**
     * The array of
     * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
     * IDs used by the VPC configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The array of [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html)
     * IDs used by the VPC configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The array of
       * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
       * IDs used by the VPC configuration. 
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The array of
       * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
       * IDs used by the VPC configuration. 
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The array of
       * [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html) IDs used by
       * the VPC configuration. 
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The array of
       * [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html) IDs used by
       * the VPC configuration. 
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty.builder()

      /**
       * @param securityGroupIds The array of
       * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
       * IDs used by the VPC configuration. 
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The array of
       * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
       * IDs used by the VPC configuration. 
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The array of
       * [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html) IDs used by
       * the VPC configuration. 
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The array of
       * [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html) IDs used by
       * the VPC configuration. 
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty,
    ) : CdkObject(cdkObject),
        VpcConfigurationProperty {
      /**
       * The array of
       * [SecurityGroup](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SecurityGroup.html)
       * IDs used by the VPC configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The array of
       * [Subnet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Subnet.html) IDs used by
       * the VPC configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-vpcconfiguration.html#cfn-kinesisanalyticsv2-application-vpcconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty):
          VpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty
    }
  }

  /**
   * The configuration of a Kinesis Data Analytics Studio notebook.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ZeppelinApplicationConfigurationProperty zeppelinApplicationConfigurationProperty =
   * ZeppelinApplicationConfigurationProperty.builder()
   * .catalogConfiguration(CatalogConfigurationProperty.builder()
   * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
   * .databaseArn("databaseArn")
   * .build())
   * .build())
   * .customArtifactsConfiguration(List.of(CustomArtifactConfigurationProperty.builder()
   * .artifactType("artifactType")
   * // the properties below are optional
   * .mavenReference(MavenReferenceProperty.builder()
   * .artifactId("artifactId")
   * .groupId("groupId")
   * .version("version")
   * .build())
   * .s3ContentLocation(S3ContentLocationProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .build()))
   * .deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty.builder()
   * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
   * .bucketArn("bucketArn")
   * // the properties below are optional
   * .basePath("basePath")
   * .build())
   * .build())
   * .monitoringConfiguration(ZeppelinMonitoringConfigurationProperty.builder()
   * .logLevel("logLevel")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html)
   */
  public interface ZeppelinApplicationConfigurationProperty {
    /**
     * The Amazon Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio
     * notebook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-catalogconfiguration)
     */
    public fun catalogConfiguration(): Any? = unwrap(this).getCatalogConfiguration()

    /**
     * A list of `CustomArtifactConfiguration` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-customartifactsconfiguration)
     */
    public fun customArtifactsConfiguration(): Any? = unwrap(this).getCustomArtifactsConfiguration()

    /**
     * The information required to deploy a Kinesis Data Analytics Studio notebook as an application
     * with durable state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-deployasapplicationconfiguration)
     */
    public fun deployAsApplicationConfiguration(): Any? =
        unwrap(this).getDeployAsApplicationConfiguration()

    /**
     * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-monitoringconfiguration)
     */
    public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

    /**
     * A builder for [ZeppelinApplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
       * Kinesis Data Analytics Studio notebook.
       */
      public fun catalogConfiguration(catalogConfiguration: IResolvable)

      /**
       * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
       * Kinesis Data Analytics Studio notebook.
       */
      public fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty)

      /**
       * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
       * Kinesis Data Analytics Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a406bfd3e8053c07a462ec7468245bbddb1fa3ae179fb0485f855c8505624ff5")
      public
          fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
       */
      public fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable)

      /**
       * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
       */
      public fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>)

      /**
       * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
       */
      public fun customArtifactsConfiguration(vararg customArtifactsConfiguration: Any)

      /**
       * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
       * Analytics Studio notebook as an application with durable state.
       */
      public fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable)

      /**
       * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
       * Analytics Studio notebook as an application with durable state.
       */
      public
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty)

      /**
       * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
       * Analytics Studio notebook as an application with durable state.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9734947c6d04cb8ce747f61b9050d89a184a8d97a4950f8c49ede2bb1b258120")
      public
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics
       * Studio notebook.
       */
      public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

      /**
       * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics
       * Studio notebook.
       */
      public
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty)

      /**
       * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics
       * Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("478c5fb34e0581806a21c8449fa45f9af1304548502762c92f91e8db29d054d4")
      public
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty.builder()

      /**
       * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
       * Kinesis Data Analytics Studio notebook.
       */
      override fun catalogConfiguration(catalogConfiguration: IResolvable) {
        cdkBuilder.catalogConfiguration(catalogConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
       * Kinesis Data Analytics Studio notebook.
       */
      override fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty) {
        cdkBuilder.catalogConfiguration(catalogConfiguration.let(CatalogConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param catalogConfiguration The Amazon Glue Data Catalog that you use in queries in a
       * Kinesis Data Analytics Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a406bfd3e8053c07a462ec7468245bbddb1fa3ae179fb0485f855c8505624ff5")
      override
          fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit):
          Unit = catalogConfiguration(CatalogConfigurationProperty(catalogConfiguration))

      /**
       * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
       */
      override fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable) {
        cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
       */
      override fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>) {
        cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customArtifactsConfiguration A list of `CustomArtifactConfiguration` objects.
       */
      override fun customArtifactsConfiguration(vararg customArtifactsConfiguration: Any): Unit =
          customArtifactsConfiguration(customArtifactsConfiguration.toList())

      /**
       * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
       * Analytics Studio notebook as an application with durable state.
       */
      override fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
       * Analytics Studio notebook as an application with durable state.
       */
      override
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration.let(DeployAsApplicationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param deployAsApplicationConfiguration The information required to deploy a Kinesis Data
       * Analytics Studio notebook as an application with durable state.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9734947c6d04cb8ce747f61b9050d89a184a8d97a4950f8c49ede2bb1b258120")
      override
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty(deployAsApplicationConfiguration))

      /**
       * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics
       * Studio notebook.
       */
      override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics
       * Studio notebook.
       */
      override
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(ZeppelinMonitoringConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param monitoringConfiguration The monitoring configuration of a Kinesis Data Analytics
       * Studio notebook.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("478c5fb34e0581806a21c8449fa45f9af1304548502762c92f91e8db29d054d4")
      override
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit):
          Unit =
          monitoringConfiguration(ZeppelinMonitoringConfigurationProperty(monitoringConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty,
    ) : CdkObject(cdkObject),
        ZeppelinApplicationConfigurationProperty {
      /**
       * The Amazon Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio
       * notebook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-catalogconfiguration)
       */
      override fun catalogConfiguration(): Any? = unwrap(this).getCatalogConfiguration()

      /**
       * A list of `CustomArtifactConfiguration` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-customartifactsconfiguration)
       */
      override fun customArtifactsConfiguration(): Any? =
          unwrap(this).getCustomArtifactsConfiguration()

      /**
       * The information required to deploy a Kinesis Data Analytics Studio notebook as an
       * application with durable state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-deployasapplicationconfiguration)
       */
      override fun deployAsApplicationConfiguration(): Any? =
          unwrap(this).getDeployAsApplicationConfiguration()

      /**
       * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinapplicationconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinapplicationconfiguration-monitoringconfiguration)
       */
      override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZeppelinApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty):
          ZeppelinApplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ZeppelinApplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZeppelinApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty
    }
  }

  /**
   * Describes configuration parameters for Amazon CloudWatch logging for a Kinesis Data Analytics
   * Studio notebook.
   *
   * For more information about CloudWatch logging, see
   * [Monitoring](https://docs.aws.amazon.com/managed-flink/latest/java/monitoring-overview.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.*;
   * ZeppelinMonitoringConfigurationProperty zeppelinMonitoringConfigurationProperty =
   * ZeppelinMonitoringConfigurationProperty.builder()
   * .logLevel("logLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html)
   */
  public interface ZeppelinMonitoringConfigurationProperty {
    /**
     * The verbosity of the CloudWatch Logs for an application.
     *
     * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration-loglevel)
     */
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * A builder for [ZeppelinMonitoringConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logLevel The verbosity of the CloudWatch Logs for an application.
       * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
       */
      public fun logLevel(logLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty.builder()

      /**
       * @param logLevel The verbosity of the CloudWatch Logs for an application.
       * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty,
    ) : CdkObject(cdkObject),
        ZeppelinMonitoringConfigurationProperty {
      /**
       * The verbosity of the CloudWatch Logs for an application.
       *
       * You can set it to `INFO` , `WARN` , `ERROR` , or `DEBUG` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration.html#cfn-kinesisanalyticsv2-application-zeppelinmonitoringconfiguration-loglevel)
       */
      override fun logLevel(): String? = unwrap(this).getLogLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZeppelinMonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty):
          ZeppelinMonitoringConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ZeppelinMonitoringConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZeppelinMonitoringConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty
    }
  }
}
