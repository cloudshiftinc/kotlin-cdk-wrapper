package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicationConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfig,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the Replication Config.
   */
  public open fun attrReplicationConfigArn(): String = unwrap(this).getAttrReplicationConfigArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Configuration parameters for provisioning an AWS DMS Serverless replication.
   */
  public open fun computeConfig(): Any? = unwrap(this).getComputeConfig()

  /**
   * Configuration parameters for provisioning an AWS DMS Serverless replication.
   */
  public open fun computeConfig(`value`: IResolvable) {
    unwrap(this).setComputeConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration parameters for provisioning an AWS DMS Serverless replication.
   */
  public open fun computeConfig(`value`: ComputeConfigProperty) {
    unwrap(this).setComputeConfig(`value`.let(ComputeConfigProperty::unwrap))
  }

  /**
   * Configuration parameters for provisioning an AWS DMS Serverless replication.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea9b390b50089fd07693eb2a50e85bdb5d768dd07e29853a352d886c5f6a364")
  public open fun computeConfig(`value`: ComputeConfigProperty.Builder.() -> Unit): Unit =
      computeConfig(ComputeConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A unique identifier that you want to use to create a `ReplicationConfigArn` that is returned as
   * part of the output from this action.
   */
  public open fun replicationConfigIdentifier(): String? =
      unwrap(this).getReplicationConfigIdentifier()

  /**
   * A unique identifier that you want to use to create a `ReplicationConfigArn` that is returned as
   * part of the output from this action.
   */
  public open fun replicationConfigIdentifier(`value`: String) {
    unwrap(this).setReplicationConfigIdentifier(`value`)
  }

  /**
   * Optional JSON settings for AWS DMS Serverless replications that are provisioned using this
   * replication configuration.
   */
  public open fun replicationSettings(): Any? = unwrap(this).getReplicationSettings()

  /**
   * Optional JSON settings for AWS DMS Serverless replications that are provisioned using this
   * replication configuration.
   */
  public open fun replicationSettings(`value`: Any) {
    unwrap(this).setReplicationSettings(`value`)
  }

  /**
   * The type of AWS DMS Serverless replication to provision using this replication configuration.
   */
  public open fun replicationType(): String? = unwrap(this).getReplicationType()

  /**
   * The type of AWS DMS Serverless replication to provision using this replication configuration.
   */
  public open fun replicationType(`value`: String) {
    unwrap(this).setReplicationType(`value`)
  }

  /**
   * Optional unique value or name that you set for a given resource that can be used to construct
   * an Amazon Resource Name (ARN) for that resource.
   */
  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * Optional unique value or name that you set for a given resource that can be used to construct
   * an Amazon Resource Name (ARN) for that resource.
   */
  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the source endpoint for this AWS DMS Serverless replication
   * configuration.
   */
  public open fun sourceEndpointArn(): String? = unwrap(this).getSourceEndpointArn()

  /**
   * The Amazon Resource Name (ARN) of the source endpoint for this AWS DMS Serverless replication
   * configuration.
   */
  public open fun sourceEndpointArn(`value`: String) {
    unwrap(this).setSourceEndpointArn(`value`)
  }

  /**
   * Optional JSON settings for specifying supplemental data.
   */
  public open fun supplementalSettings(): Any? = unwrap(this).getSupplementalSettings()

  /**
   * Optional JSON settings for specifying supplemental data.
   */
  public open fun supplementalSettings(`value`: Any) {
    unwrap(this).setSupplementalSettings(`value`)
  }

  /**
   * JSON table mappings for AWS DMS Serverless replications that are provisioned using this
   * replication configuration.
   */
  public open fun tableMappings(): Any? = unwrap(this).getTableMappings()

  /**
   * JSON table mappings for AWS DMS Serverless replications that are provisioned using this
   * replication configuration.
   */
  public open fun tableMappings(`value`: Any) {
    unwrap(this).setTableMappings(`value`)
  }

  /**
   * One or more optional tags associated with resources used by the AWS DMS Serverless replication.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * One or more optional tags associated with resources used by the AWS DMS Serverless replication.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * One or more optional tags associated with resources used by the AWS DMS Serverless replication.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the target endpoint for this AWS DMS serverless replication
   * configuration.
   */
  public open fun targetEndpointArn(): String? = unwrap(this).getTargetEndpointArn()

  /**
   * The Amazon Resource Name (ARN) of the target endpoint for this AWS DMS serverless replication
   * configuration.
   */
  public open fun targetEndpointArn(`value`: String) {
    unwrap(this).setTargetEndpointArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnReplicationConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication. 
     */
    public fun computeConfig(computeConfig: IResolvable)

    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication. 
     */
    public fun computeConfig(computeConfig: ComputeConfigProperty)

    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8b204c7b9e5ebf2801fdcf758bcf72e12064ffee5778d3aba0c041c9d675c95")
    public fun computeConfig(computeConfig: ComputeConfigProperty.Builder.() -> Unit)

    /**
     * A unique identifier that you want to use to create a `ReplicationConfigArn` that is returned
     * as part of the output from this action.
     *
     * You can then pass this output `ReplicationConfigArn` as the value of the
     * `ReplicationConfigArn` option for other actions to identify both AWS DMS Serverless replications
     * and replication configurations that you want those actions to operate on. For some actions, you
     * can also use either this unique identifier or a corresponding ARN in action filters to identify
     * the specific replication and replication configuration to operate on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationconfigidentifier)
     * @param replicationConfigIdentifier A unique identifier that you want to use to create a
     * `ReplicationConfigArn` that is returned as part of the output from this action. 
     */
    public fun replicationConfigIdentifier(replicationConfigIdentifier: String)

    /**
     * Optional JSON settings for AWS DMS Serverless replications that are provisioned using this
     * replication configuration.
     *
     * For example, see [Change processing tuning
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationsettings)
     * @param replicationSettings Optional JSON settings for AWS DMS Serverless replications that
     * are provisioned using this replication configuration. 
     */
    public fun replicationSettings(replicationSettings: Any)

    /**
     * The type of AWS DMS Serverless replication to provision using this replication configuration.
     *
     * Possible values:
     *
     * * `"full-load"`
     * * `"cdc"`
     * * `"full-load-and-cdc"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationtype)
     * @param replicationType The type of AWS DMS Serverless replication to provision using this
     * replication configuration. 
     */
    public fun replicationType(replicationType: String)

    /**
     * Optional unique value or name that you set for a given resource that can be used to construct
     * an Amazon Resource Name (ARN) for that resource.
     *
     * For more information, see [Fine-grained access control using resource names and
     * tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-resourceidentifier)
     * @param resourceIdentifier Optional unique value or name that you set for a given resource
     * that can be used to construct an Amazon Resource Name (ARN) for that resource. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * The Amazon Resource Name (ARN) of the source endpoint for this AWS DMS Serverless replication
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-sourceendpointarn)
     * @param sourceEndpointArn The Amazon Resource Name (ARN) of the source endpoint for this AWS
     * DMS Serverless replication configuration. 
     */
    public fun sourceEndpointArn(sourceEndpointArn: String)

    /**
     * Optional JSON settings for specifying supplemental data.
     *
     * For more information, see [Specifying supplemental data for task
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-supplementalsettings)
     * @param supplementalSettings Optional JSON settings for specifying supplemental data. 
     */
    public fun supplementalSettings(supplementalSettings: Any)

    /**
     * JSON table mappings for AWS DMS Serverless replications that are provisioned using this
     * replication configuration.
     *
     * For more information, see [Specifying table selection and transformations rules using
     * JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tablemappings)
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     * provisioned using this replication configuration. 
     */
    public fun tableMappings(tableMappings: Any)

    /**
     * One or more optional tags associated with resources used by the AWS DMS Serverless
     * replication.
     *
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tags)
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more optional tags associated with resources used by the AWS DMS Serverless
     * replication.
     *
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tags)
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The Amazon Resource Name (ARN) of the target endpoint for this AWS DMS serverless replication
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-targetendpointarn)
     * @param targetEndpointArn The Amazon Resource Name (ARN) of the target endpoint for this AWS
     * DMS serverless replication configuration. 
     */
    public fun targetEndpointArn(targetEndpointArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationConfig.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationConfig.Builder.create(scope, id)

    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication. 
     */
    override fun computeConfig(computeConfig: IResolvable) {
      cdkBuilder.computeConfig(computeConfig.let(IResolvable::unwrap))
    }

    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication. 
     */
    override fun computeConfig(computeConfig: ComputeConfigProperty) {
      cdkBuilder.computeConfig(computeConfig.let(ComputeConfigProperty::unwrap))
    }

    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8b204c7b9e5ebf2801fdcf758bcf72e12064ffee5778d3aba0c041c9d675c95")
    override fun computeConfig(computeConfig: ComputeConfigProperty.Builder.() -> Unit): Unit =
        computeConfig(ComputeConfigProperty(computeConfig))

    /**
     * A unique identifier that you want to use to create a `ReplicationConfigArn` that is returned
     * as part of the output from this action.
     *
     * You can then pass this output `ReplicationConfigArn` as the value of the
     * `ReplicationConfigArn` option for other actions to identify both AWS DMS Serverless replications
     * and replication configurations that you want those actions to operate on. For some actions, you
     * can also use either this unique identifier or a corresponding ARN in action filters to identify
     * the specific replication and replication configuration to operate on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationconfigidentifier)
     * @param replicationConfigIdentifier A unique identifier that you want to use to create a
     * `ReplicationConfigArn` that is returned as part of the output from this action. 
     */
    override fun replicationConfigIdentifier(replicationConfigIdentifier: String) {
      cdkBuilder.replicationConfigIdentifier(replicationConfigIdentifier)
    }

    /**
     * Optional JSON settings for AWS DMS Serverless replications that are provisioned using this
     * replication configuration.
     *
     * For example, see [Change processing tuning
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationsettings)
     * @param replicationSettings Optional JSON settings for AWS DMS Serverless replications that
     * are provisioned using this replication configuration. 
     */
    override fun replicationSettings(replicationSettings: Any) {
      cdkBuilder.replicationSettings(replicationSettings)
    }

    /**
     * The type of AWS DMS Serverless replication to provision using this replication configuration.
     *
     * Possible values:
     *
     * * `"full-load"`
     * * `"cdc"`
     * * `"full-load-and-cdc"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationtype)
     * @param replicationType The type of AWS DMS Serverless replication to provision using this
     * replication configuration. 
     */
    override fun replicationType(replicationType: String) {
      cdkBuilder.replicationType(replicationType)
    }

    /**
     * Optional unique value or name that you set for a given resource that can be used to construct
     * an Amazon Resource Name (ARN) for that resource.
     *
     * For more information, see [Fine-grained access control using resource names and
     * tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-resourceidentifier)
     * @param resourceIdentifier Optional unique value or name that you set for a given resource
     * that can be used to construct an Amazon Resource Name (ARN) for that resource. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * The Amazon Resource Name (ARN) of the source endpoint for this AWS DMS Serverless replication
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-sourceendpointarn)
     * @param sourceEndpointArn The Amazon Resource Name (ARN) of the source endpoint for this AWS
     * DMS Serverless replication configuration. 
     */
    override fun sourceEndpointArn(sourceEndpointArn: String) {
      cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    /**
     * Optional JSON settings for specifying supplemental data.
     *
     * For more information, see [Specifying supplemental data for task
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-supplementalsettings)
     * @param supplementalSettings Optional JSON settings for specifying supplemental data. 
     */
    override fun supplementalSettings(supplementalSettings: Any) {
      cdkBuilder.supplementalSettings(supplementalSettings)
    }

    /**
     * JSON table mappings for AWS DMS Serverless replications that are provisioned using this
     * replication configuration.
     *
     * For more information, see [Specifying table selection and transformations rules using
     * JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tablemappings)
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     * provisioned using this replication configuration. 
     */
    override fun tableMappings(tableMappings: Any) {
      cdkBuilder.tableMappings(tableMappings)
    }

    /**
     * One or more optional tags associated with resources used by the AWS DMS Serverless
     * replication.
     *
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tags)
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * One or more optional tags associated with resources used by the AWS DMS Serverless
     * replication.
     *
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tags)
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The Amazon Resource Name (ARN) of the target endpoint for this AWS DMS serverless replication
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-targetendpointarn)
     * @param targetEndpointArn The Amazon Resource Name (ARN) of the target endpoint for this AWS
     * DMS serverless replication configuration. 
     */
    override fun targetEndpointArn(targetEndpointArn: String) {
      cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnReplicationConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfig):
        CfnReplicationConfig = CfnReplicationConfig(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationConfig):
        software.amazon.awscdk.services.dms.CfnReplicationConfig = wrapped.cdkObject
  }

  public interface ComputeConfigProperty {
    /**
     * The Availability Zone where the AWS DMS Serverless replication using this configuration will
     * run.
     *
     * The default value is a random, system-chosen Availability Zone in the configuration's AWS
     * Region , for example, `"us-west-2"` . You can't set this parameter if the `MultiAZ` parameter is
     * set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * A list of custom DNS name servers supported for the AWS DMS Serverless replication to access
     * your source or target database.
     *
     * This list overrides the default name servers supported by the AWS DMS Serverless replication.
     * You can specify a comma-separated list of internet addresses for up to four DNS name servers.
     * For example: `"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-dnsnameservers)
     */
    public fun dnsNameServers(): String? = unwrap(this).getDnsNameServers()

    /**
     * An AWS Key Management Service ( AWS KMS ) key Amazon Resource Name (ARN) that is used to
     * encrypt the data during AWS DMS Serverless replication.
     *
     * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
     * encryption key.
     *
     * AWS KMS creates the default encryption key for your Amazon Web Services account. Your AWS
     * account has a different default encryption key for each AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Specifies the maximum value of the AWS DMS capacity units (DCUs) for which a given AWS DMS
     * Serverless replication can be provisioned.
     *
     * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
     * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you
     * can specify for AWS DMS Serverless is 384. The `MaxCapacityUnits` parameter is the only DCU
     * parameter you are required to specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-maxcapacityunits)
     */
    public fun maxCapacityUnits(): Number

    /**
     * Specifies the minimum value of the AWS DMS capacity units (DCUs) for which a given AWS DMS
     * Serverless replication can be provisioned.
     *
     * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
     * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that
     * you can specify for AWS DMS Serverless is 1. If you don't set this value, AWS DMS sets this
     * parameter to the minimum DCU value allowed, 1. If there is no current source activity, AWS DMS
     * scales down your replication until it reaches the value specified in `MinCapacityUnits` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-mincapacityunits)
     */
    public fun minCapacityUnits(): Number? = unwrap(this).getMinCapacityUnits()

    /**
     * Specifies whether the AWS DMS Serverless replication is a Multi-AZ deployment.
     *
     * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-multiaz)
     */
    public fun multiAz(): Any? = unwrap(this).getMultiAz()

    /**
     * The weekly time range during which system maintenance can occur for the AWS DMS Serverless
     * replication, in Universal Coordinated Time (UTC).
     *
     * The format is `ddd:hh24:mi-ddd:hh24:mi` .
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time per AWS
     * Region . This maintenance occurs on a random day of the week. Valid values for days of the week
     * include `Mon` , `Tue` , `Wed` , `Thu` , `Fri` , `Sat` , and `Sun` .
     *
     * Constraints include a minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-preferredmaintenancewindow)
     */
    public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

    /**
     * Specifies a subnet group identifier to associate with the AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-replicationsubnetgroupid)
     */
    public fun replicationSubnetGroupId(): String? = unwrap(this).getReplicationSubnetGroupId()

    /**
     * Specifies the virtual private cloud (VPC) security group to use with the AWS DMS Serverless
     * replication.
     *
     * The VPC security group must work with the VPC containing the replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-vpcsecuritygroupids)
     */
    public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()

    /**
     * A builder for [ComputeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone where the AWS DMS Serverless replication
       * using this configuration will run.
       * The default value is a random, system-chosen Availability Zone in the configuration's AWS
       * Region , for example, `"us-west-2"` . You can't set this parameter if the `MultiAZ` parameter
       * is set to `true` .
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param dnsNameServers A list of custom DNS name servers supported for the AWS DMS
       * Serverless replication to access your source or target database.
       * This list overrides the default name servers supported by the AWS DMS Serverless
       * replication. You can specify a comma-separated list of internet addresses for up to four DNS
       * name servers. For example: `"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"`
       */
      public fun dnsNameServers(dnsNameServers: String)

      /**
       * @param kmsKeyId An AWS Key Management Service ( AWS KMS ) key Amazon Resource Name (ARN)
       * that is used to encrypt the data during AWS DMS Serverless replication.
       * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
       * encryption key.
       *
       * AWS KMS creates the default encryption key for your Amazon Web Services account. Your AWS
       * account has a different default encryption key for each AWS Region .
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param maxCapacityUnits Specifies the maximum value of the AWS DMS capacity units (DCUs)
       * for which a given AWS DMS Serverless replication can be provisioned. 
       * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
       * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you
       * can specify for AWS DMS Serverless is 384. The `MaxCapacityUnits` parameter is the only DCU
       * parameter you are required to specify.
       */
      public fun maxCapacityUnits(maxCapacityUnits: Number)

      /**
       * @param minCapacityUnits Specifies the minimum value of the AWS DMS capacity units (DCUs)
       * for which a given AWS DMS Serverless replication can be provisioned.
       * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
       * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that
       * you can specify for AWS DMS Serverless is 1. If you don't set this value, AWS DMS sets this
       * parameter to the minimum DCU value allowed, 1. If there is no current source activity, AWS DMS
       * scales down your replication until it reaches the value specified in `MinCapacityUnits` .
       */
      public fun minCapacityUnits(minCapacityUnits: Number)

      /**
       * @param multiAz Specifies whether the AWS DMS Serverless replication is a Multi-AZ
       * deployment.
       * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true`
       * .
       */
      public fun multiAz(multiAz: Boolean)

      /**
       * @param multiAz Specifies whether the AWS DMS Serverless replication is a Multi-AZ
       * deployment.
       * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true`
       * .
       */
      public fun multiAz(multiAz: IResolvable)

      /**
       * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
       * occur for the AWS DMS Serverless replication, in Universal Coordinated Time (UTC).
       * The format is `ddd:hh24:mi-ddd:hh24:mi` .
       *
       * The default is a 30-minute window selected at random from an 8-hour block of time per AWS
       * Region . This maintenance occurs on a random day of the week. Valid values for days of the
       * week include `Mon` , `Tue` , `Wed` , `Thu` , `Fri` , `Sat` , and `Sun` .
       *
       * Constraints include a minimum 30-minute window.
       */
      public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

      /**
       * @param replicationSubnetGroupId Specifies a subnet group identifier to associate with the
       * AWS DMS Serverless replication.
       */
      public fun replicationSubnetGroupId(replicationSubnetGroupId: String)

      /**
       * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to use
       * with the AWS DMS Serverless replication.
       * The VPC security group must work with the VPC containing the replication.
       */
      public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

      /**
       * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to use
       * with the AWS DMS Serverless replication.
       * The VPC security group must work with the VPC containing the replication.
       */
      public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty.Builder =
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty.builder()

      /**
       * @param availabilityZone The Availability Zone where the AWS DMS Serverless replication
       * using this configuration will run.
       * The default value is a random, system-chosen Availability Zone in the configuration's AWS
       * Region , for example, `"us-west-2"` . You can't set this parameter if the `MultiAZ` parameter
       * is set to `true` .
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param dnsNameServers A list of custom DNS name servers supported for the AWS DMS
       * Serverless replication to access your source or target database.
       * This list overrides the default name servers supported by the AWS DMS Serverless
       * replication. You can specify a comma-separated list of internet addresses for up to four DNS
       * name servers. For example: `"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"`
       */
      override fun dnsNameServers(dnsNameServers: String) {
        cdkBuilder.dnsNameServers(dnsNameServers)
      }

      /**
       * @param kmsKeyId An AWS Key Management Service ( AWS KMS ) key Amazon Resource Name (ARN)
       * that is used to encrypt the data during AWS DMS Serverless replication.
       * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
       * encryption key.
       *
       * AWS KMS creates the default encryption key for your Amazon Web Services account. Your AWS
       * account has a different default encryption key for each AWS Region .
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param maxCapacityUnits Specifies the maximum value of the AWS DMS capacity units (DCUs)
       * for which a given AWS DMS Serverless replication can be provisioned. 
       * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
       * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you
       * can specify for AWS DMS Serverless is 384. The `MaxCapacityUnits` parameter is the only DCU
       * parameter you are required to specify.
       */
      override fun maxCapacityUnits(maxCapacityUnits: Number) {
        cdkBuilder.maxCapacityUnits(maxCapacityUnits)
      }

      /**
       * @param minCapacityUnits Specifies the minimum value of the AWS DMS capacity units (DCUs)
       * for which a given AWS DMS Serverless replication can be provisioned.
       * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
       * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that
       * you can specify for AWS DMS Serverless is 1. If you don't set this value, AWS DMS sets this
       * parameter to the minimum DCU value allowed, 1. If there is no current source activity, AWS DMS
       * scales down your replication until it reaches the value specified in `MinCapacityUnits` .
       */
      override fun minCapacityUnits(minCapacityUnits: Number) {
        cdkBuilder.minCapacityUnits(minCapacityUnits)
      }

      /**
       * @param multiAz Specifies whether the AWS DMS Serverless replication is a Multi-AZ
       * deployment.
       * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true`
       * .
       */
      override fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
      }

      /**
       * @param multiAz Specifies whether the AWS DMS Serverless replication is a Multi-AZ
       * deployment.
       * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true`
       * .
       */
      override fun multiAz(multiAz: IResolvable) {
        cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
      }

      /**
       * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
       * occur for the AWS DMS Serverless replication, in Universal Coordinated Time (UTC).
       * The format is `ddd:hh24:mi-ddd:hh24:mi` .
       *
       * The default is a 30-minute window selected at random from an 8-hour block of time per AWS
       * Region . This maintenance occurs on a random day of the week. Valid values for days of the
       * week include `Mon` , `Tue` , `Wed` , `Thu` , `Fri` , `Sat` , and `Sun` .
       *
       * Constraints include a minimum 30-minute window.
       */
      override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
      }

      /**
       * @param replicationSubnetGroupId Specifies a subnet group identifier to associate with the
       * AWS DMS Serverless replication.
       */
      override fun replicationSubnetGroupId(replicationSubnetGroupId: String) {
        cdkBuilder.replicationSubnetGroupId(replicationSubnetGroupId)
      }

      /**
       * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to use
       * with the AWS DMS Serverless replication.
       * The VPC security group must work with the VPC containing the replication.
       */
      override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
        cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
      }

      /**
       * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to use
       * with the AWS DMS Serverless replication.
       * The VPC security group must work with the VPC containing the replication.
       */
      override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
          vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

      public fun build():
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty,
    ) : CdkObject(cdkObject), ComputeConfigProperty {
      /**
       * The Availability Zone where the AWS DMS Serverless replication using this configuration
       * will run.
       *
       * The default value is a random, system-chosen Availability Zone in the configuration's AWS
       * Region , for example, `"us-west-2"` . You can't set this parameter if the `MultiAZ` parameter
       * is set to `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * A list of custom DNS name servers supported for the AWS DMS Serverless replication to
       * access your source or target database.
       *
       * This list overrides the default name servers supported by the AWS DMS Serverless
       * replication. You can specify a comma-separated list of internet addresses for up to four DNS
       * name servers. For example: `"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-dnsnameservers)
       */
      override fun dnsNameServers(): String? = unwrap(this).getDnsNameServers()

      /**
       * An AWS Key Management Service ( AWS KMS ) key Amazon Resource Name (ARN) that is used to
       * encrypt the data during AWS DMS Serverless replication.
       *
       * If you don't specify a value for the `KmsKeyId` parameter, AWS DMS uses your default
       * encryption key.
       *
       * AWS KMS creates the default encryption key for your Amazon Web Services account. Your AWS
       * account has a different default encryption key for each AWS Region .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Specifies the maximum value of the AWS DMS capacity units (DCUs) for which a given AWS DMS
       * Serverless replication can be provisioned.
       *
       * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
       * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you
       * can specify for AWS DMS Serverless is 384. The `MaxCapacityUnits` parameter is the only DCU
       * parameter you are required to specify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-maxcapacityunits)
       */
      override fun maxCapacityUnits(): Number = unwrap(this).getMaxCapacityUnits()

      /**
       * Specifies the minimum value of the AWS DMS capacity units (DCUs) for which a given AWS DMS
       * Serverless replication can be provisioned.
       *
       * A single DCU is 2GB of RAM, with 1 DCU as the minimum value allowed. The list of valid DCU
       * values includes 1, 2, 4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that
       * you can specify for AWS DMS Serverless is 1. If you don't set this value, AWS DMS sets this
       * parameter to the minimum DCU value allowed, 1. If there is no current source activity, AWS DMS
       * scales down your replication until it reaches the value specified in `MinCapacityUnits` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-mincapacityunits)
       */
      override fun minCapacityUnits(): Number? = unwrap(this).getMinCapacityUnits()

      /**
       * Specifies whether the AWS DMS Serverless replication is a Multi-AZ deployment.
       *
       * You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-multiaz)
       */
      override fun multiAz(): Any? = unwrap(this).getMultiAz()

      /**
       * The weekly time range during which system maintenance can occur for the AWS DMS Serverless
       * replication, in Universal Coordinated Time (UTC).
       *
       * The format is `ddd:hh24:mi-ddd:hh24:mi` .
       *
       * The default is a 30-minute window selected at random from an 8-hour block of time per AWS
       * Region . This maintenance occurs on a random day of the week. Valid values for days of the
       * week include `Mon` , `Tue` , `Wed` , `Thu` , `Fri` , `Sat` , and `Sun` .
       *
       * Constraints include a minimum 30-minute window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-preferredmaintenancewindow)
       */
      override fun preferredMaintenanceWindow(): String? =
          unwrap(this).getPreferredMaintenanceWindow()

      /**
       * Specifies a subnet group identifier to associate with the AWS DMS Serverless replication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-replicationsubnetgroupid)
       */
      override fun replicationSubnetGroupId(): String? = unwrap(this).getReplicationSubnetGroupId()

      /**
       * Specifies the virtual private cloud (VPC) security group to use with the AWS DMS Serverless
       * replication.
       *
       * The VPC security group must work with the VPC containing the replication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html#cfn-dms-replicationconfig-computeconfig-vpcsecuritygroupids)
       */
      override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty):
          ComputeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeConfigProperty):
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty
    }
  }
}
