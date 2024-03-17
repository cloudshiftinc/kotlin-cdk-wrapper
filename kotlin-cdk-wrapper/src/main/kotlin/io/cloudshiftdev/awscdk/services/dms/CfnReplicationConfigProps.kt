@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnReplicationConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * Object replicationSettings;
 * Object supplementalSettings;
 * Object tableMappings;
 * CfnReplicationConfigProps cfnReplicationConfigProps = CfnReplicationConfigProps.builder()
 * .computeConfig(ComputeConfigProperty.builder()
 * .maxCapacityUnits(123)
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .dnsNameServers("dnsNameServers")
 * .kmsKeyId("kmsKeyId")
 * .minCapacityUnits(123)
 * .multiAz(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .replicationSubnetGroupId("replicationSubnetGroupId")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build())
 * .replicationConfigIdentifier("replicationConfigIdentifier")
 * .replicationSettings(replicationSettings)
 * .replicationType("replicationType")
 * .resourceIdentifier("resourceIdentifier")
 * .sourceEndpointArn("sourceEndpointArn")
 * .supplementalSettings(supplementalSettings)
 * .tableMappings(tableMappings)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetEndpointArn("targetEndpointArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html)
 */
public interface CfnReplicationConfigProps {
  /**
   * Configuration parameters for provisioning an AWS DMS Serverless replication.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
   */
  public fun computeConfig(): Any? = unwrap(this).getComputeConfig()

  /**
   * A unique identifier that you want to use to create a `ReplicationConfigArn` that is returned as
   * part of the output from this action.
   *
   * You can then pass this output `ReplicationConfigArn` as the value of the `ReplicationConfigArn`
   * option for other actions to identify both AWS DMS Serverless replications and replication
   * configurations that you want those actions to operate on. For some actions, you can also use
   * either this unique identifier or a corresponding ARN in action filters to identify the specific
   * replication and replication configuration to operate on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationconfigidentifier)
   */
  public fun replicationConfigIdentifier(): String? = unwrap(this).getReplicationConfigIdentifier()

  /**
   * Optional JSON settings for AWS DMS Serverless replications that are provisioned using this
   * replication configuration.
   *
   * For example, see [Change processing tuning
   * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationsettings)
   */
  public fun replicationSettings(): Any? = unwrap(this).getReplicationSettings()

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
   */
  public fun replicationType(): String? = unwrap(this).getReplicationType()

  /**
   * Optional unique value or name that you set for a given resource that can be used to construct
   * an Amazon Resource Name (ARN) for that resource.
   *
   * For more information, see [Fine-grained access control using resource names and
   * tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-resourceidentifier)
   */
  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  /**
   * The Amazon Resource Name (ARN) of the source endpoint for this AWS DMS Serverless replication
   * configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-sourceendpointarn)
   */
  public fun sourceEndpointArn(): String? = unwrap(this).getSourceEndpointArn()

  /**
   * Optional JSON settings for specifying supplemental data.
   *
   * For more information, see [Specifying supplemental data for task
   * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-supplementalsettings)
   */
  public fun supplementalSettings(): Any? = unwrap(this).getSupplementalSettings()

  /**
   * JSON table mappings for AWS DMS Serverless replications that are provisioned using this
   * replication configuration.
   *
   * For more information, see [Specifying table selection and transformations rules using
   * JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tablemappings)
   */
  public fun tableMappings(): Any? = unwrap(this).getTableMappings()

  /**
   * One or more optional tags associated with resources used by the AWS DMS Serverless replication.
   *
   * For more information, see [Tagging resources in AWS Database Migration
   * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the target endpoint for this AWS DMS serverless replication
   * configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-targetendpointarn)
   */
  public fun targetEndpointArn(): String? = unwrap(this).getTargetEndpointArn()

  /**
   * A builder for [CfnReplicationConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication.
     */
    public fun computeConfig(computeConfig: IResolvable)

    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication.
     */
    public fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty)

    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48f0a1ddb325030aa58029aeabf6302e1a395a57e340bb964b54170359f95fe0")
    public
        fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty.Builder.() -> Unit)

    /**
     * @param replicationConfigIdentifier A unique identifier that you want to use to create a
     * `ReplicationConfigArn` that is returned as part of the output from this action.
     * You can then pass this output `ReplicationConfigArn` as the value of the
     * `ReplicationConfigArn` option for other actions to identify both AWS DMS Serverless replications
     * and replication configurations that you want those actions to operate on. For some actions, you
     * can also use either this unique identifier or a corresponding ARN in action filters to identify
     * the specific replication and replication configuration to operate on.
     */
    public fun replicationConfigIdentifier(replicationConfigIdentifier: String)

    /**
     * @param replicationSettings Optional JSON settings for AWS DMS Serverless replications that
     * are provisioned using this replication configuration.
     * For example, see [Change processing tuning
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     * .
     */
    public fun replicationSettings(replicationSettings: Any)

    /**
     * @param replicationType The type of AWS DMS Serverless replication to provision using this
     * replication configuration.
     * Possible values:
     *
     * * `"full-load"`
     * * `"cdc"`
     * * `"full-load-and-cdc"`
     */
    public fun replicationType(replicationType: String)

    /**
     * @param resourceIdentifier Optional unique value or name that you set for a given resource
     * that can be used to construct an Amazon Resource Name (ARN) for that resource.
     * For more information, see [Fine-grained access control using resource names and
     * tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     * .
     */
    public fun resourceIdentifier(resourceIdentifier: String)

    /**
     * @param sourceEndpointArn The Amazon Resource Name (ARN) of the source endpoint for this AWS
     * DMS Serverless replication configuration.
     */
    public fun sourceEndpointArn(sourceEndpointArn: String)

    /**
     * @param supplementalSettings Optional JSON settings for specifying supplemental data.
     * For more information, see [Specifying supplemental data for task
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) .
     */
    public fun supplementalSettings(supplementalSettings: Any)

    /**
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     * provisioned using this replication configuration.
     * For more information, see [Specifying table selection and transformations rules using
     * JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
     * .
     */
    public fun tableMappings(tableMappings: Any)

    /**
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication.
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication.
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetEndpointArn The Amazon Resource Name (ARN) of the target endpoint for this AWS
     * DMS serverless replication configuration.
     */
    public fun targetEndpointArn(targetEndpointArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationConfigProps.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationConfigProps.builder()

    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication.
     */
    override fun computeConfig(computeConfig: IResolvable) {
      cdkBuilder.computeConfig(computeConfig.let(IResolvable::unwrap))
    }

    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication.
     */
    override fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty) {
      cdkBuilder.computeConfig(computeConfig.let(CfnReplicationConfig.ComputeConfigProperty::unwrap))
    }

    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     * replication.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48f0a1ddb325030aa58029aeabf6302e1a395a57e340bb964b54170359f95fe0")
    override
        fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty.Builder.() -> Unit):
        Unit = computeConfig(CfnReplicationConfig.ComputeConfigProperty(computeConfig))

    /**
     * @param replicationConfigIdentifier A unique identifier that you want to use to create a
     * `ReplicationConfigArn` that is returned as part of the output from this action.
     * You can then pass this output `ReplicationConfigArn` as the value of the
     * `ReplicationConfigArn` option for other actions to identify both AWS DMS Serverless replications
     * and replication configurations that you want those actions to operate on. For some actions, you
     * can also use either this unique identifier or a corresponding ARN in action filters to identify
     * the specific replication and replication configuration to operate on.
     */
    override fun replicationConfigIdentifier(replicationConfigIdentifier: String) {
      cdkBuilder.replicationConfigIdentifier(replicationConfigIdentifier)
    }

    /**
     * @param replicationSettings Optional JSON settings for AWS DMS Serverless replications that
     * are provisioned using this replication configuration.
     * For example, see [Change processing tuning
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     * .
     */
    override fun replicationSettings(replicationSettings: Any) {
      cdkBuilder.replicationSettings(replicationSettings)
    }

    /**
     * @param replicationType The type of AWS DMS Serverless replication to provision using this
     * replication configuration.
     * Possible values:
     *
     * * `"full-load"`
     * * `"cdc"`
     * * `"full-load-and-cdc"`
     */
    override fun replicationType(replicationType: String) {
      cdkBuilder.replicationType(replicationType)
    }

    /**
     * @param resourceIdentifier Optional unique value or name that you set for a given resource
     * that can be used to construct an Amazon Resource Name (ARN) for that resource.
     * For more information, see [Fine-grained access control using resource names and
     * tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     * .
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param sourceEndpointArn The Amazon Resource Name (ARN) of the source endpoint for this AWS
     * DMS Serverless replication configuration.
     */
    override fun sourceEndpointArn(sourceEndpointArn: String) {
      cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    /**
     * @param supplementalSettings Optional JSON settings for specifying supplemental data.
     * For more information, see [Specifying supplemental data for task
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) .
     */
    override fun supplementalSettings(supplementalSettings: Any) {
      cdkBuilder.supplementalSettings(supplementalSettings)
    }

    /**
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     * provisioned using this replication configuration.
     * For more information, see [Specifying table selection and transformations rules using
     * JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
     * .
     */
    override fun tableMappings(tableMappings: Any) {
      cdkBuilder.tableMappings(tableMappings)
    }

    /**
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication.
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     * Serverless replication.
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetEndpointArn The Amazon Resource Name (ARN) of the target endpoint for this AWS
     * DMS serverless replication configuration.
     */
    override fun targetEndpointArn(targetEndpointArn: String) {
      cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfigProps,
  ) : CdkObject(cdkObject), CfnReplicationConfigProps {
    /**
     * Configuration parameters for provisioning an AWS DMS Serverless replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-computeconfig)
     */
    override fun computeConfig(): Any? = unwrap(this).getComputeConfig()

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
     */
    override fun replicationConfigIdentifier(): String? =
        unwrap(this).getReplicationConfigIdentifier()

    /**
     * Optional JSON settings for AWS DMS Serverless replications that are provisioned using this
     * replication configuration.
     *
     * For example, see [Change processing tuning
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-replicationsettings)
     */
    override fun replicationSettings(): Any? = unwrap(this).getReplicationSettings()

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
     */
    override fun replicationType(): String? = unwrap(this).getReplicationType()

    /**
     * Optional unique value or name that you set for a given resource that can be used to construct
     * an Amazon Resource Name (ARN) for that resource.
     *
     * For more information, see [Fine-grained access control using resource names and
     * tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-resourceidentifier)
     */
    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /**
     * The Amazon Resource Name (ARN) of the source endpoint for this AWS DMS Serverless replication
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-sourceendpointarn)
     */
    override fun sourceEndpointArn(): String? = unwrap(this).getSourceEndpointArn()

    /**
     * Optional JSON settings for specifying supplemental data.
     *
     * For more information, see [Specifying supplemental data for task
     * settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-supplementalsettings)
     */
    override fun supplementalSettings(): Any? = unwrap(this).getSupplementalSettings()

    /**
     * JSON table mappings for AWS DMS Serverless replications that are provisioned using this
     * replication configuration.
     *
     * For more information, see [Specifying table selection and transformations rules using
     * JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tablemappings)
     */
    override fun tableMappings(): Any? = unwrap(this).getTableMappings()

    /**
     * One or more optional tags associated with resources used by the AWS DMS Serverless
     * replication.
     *
     * For more information, see [Tagging resources in AWS Database Migration
     * Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the target endpoint for this AWS DMS serverless replication
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html#cfn-dms-replicationconfig-targetendpointarn)
     */
    override fun targetEndpointArn(): String? = unwrap(this).getTargetEndpointArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfigProps):
        CfnReplicationConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnReplicationConfigProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationConfigProps):
        software.amazon.awscdk.services.dms.CfnReplicationConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationConfigProps
  }
}
