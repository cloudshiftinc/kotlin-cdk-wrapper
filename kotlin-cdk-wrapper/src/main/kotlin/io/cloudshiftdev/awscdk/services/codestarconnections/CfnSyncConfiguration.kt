@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Information, such as repository, branch, provider, and resource names for a specific sync
 * configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarconnections.*;
 * CfnSyncConfiguration cfnSyncConfiguration = CfnSyncConfiguration.Builder.create(this,
 * "MyCfnSyncConfiguration")
 * .branch("branch")
 * .configFile("configFile")
 * .repositoryLinkId("repositoryLinkId")
 * .resourceName("resourceName")
 * .roleArn("roleArn")
 * .syncType("syncType")
 * // the properties below are optional
 * .publishDeploymentStatus("publishDeploymentStatus")
 * .triggerResourceUpdateOn("triggerResourceUpdateOn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html)
 */
public open class CfnSyncConfiguration(
  cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSyncConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSyncConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSyncConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSyncConfigurationProps(props)
  )

  /**
   * The owner ID for the repository associated with a specific sync configuration, such as the
   * owner ID in GitHub.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The name of the external provider where your third-party code repository is configured.
   */
  public open fun attrProviderType(): String = unwrap(this).getAttrProviderType()

  /**
   * The name of the repository that is being synced to.
   */
  public open fun attrRepositoryName(): String = unwrap(this).getAttrRepositoryName()

  /**
   * The branch associated with a specific sync configuration.
   */
  public open fun branch(): String = unwrap(this).getBranch()

  /**
   * The branch associated with a specific sync configuration.
   */
  public open fun branch(`value`: String) {
    unwrap(this).setBranch(`value`)
  }

  /**
   * The file path to the configuration file associated with a specific sync configuration.
   */
  public open fun configFile(): String = unwrap(this).getConfigFile()

  /**
   * The file path to the configuration file associated with a specific sync configuration.
   */
  public open fun configFile(`value`: String) {
    unwrap(this).setConfigFile(`value`)
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
   * Whether to enable or disable publishing of deployment status to source providers.
   */
  public open fun publishDeploymentStatus(): String? = unwrap(this).getPublishDeploymentStatus()

  /**
   * Whether to enable or disable publishing of deployment status to source providers.
   */
  public open fun publishDeploymentStatus(`value`: String) {
    unwrap(this).setPublishDeploymentStatus(`value`)
  }

  /**
   * The ID of the repository link associated with a specific sync configuration.
   */
  public open fun repositoryLinkId(): String = unwrap(this).getRepositoryLinkId()

  /**
   * The ID of the repository link associated with a specific sync configuration.
   */
  public open fun repositoryLinkId(`value`: String) {
    unwrap(this).setRepositoryLinkId(`value`)
  }

  /**
   * The name of the connection resource associated with a specific sync configuration.
   */
  public open fun resourceName(): String = unwrap(this).getResourceName()

  /**
   * The name of the connection resource associated with a specific sync configuration.
   */
  public open fun resourceName(`value`: String) {
    unwrap(this).setResourceName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The type of sync for a specific sync configuration.
   */
  public open fun syncType(): String = unwrap(this).getSyncType()

  /**
   * The type of sync for a specific sync configuration.
   */
  public open fun syncType(`value`: String) {
    unwrap(this).setSyncType(`value`)
  }

  /**
   * When to trigger Git sync to begin the stack update.
   */
  public open fun triggerResourceUpdateOn(): String? = unwrap(this).getTriggerResourceUpdateOn()

  /**
   * When to trigger Git sync to begin the stack update.
   */
  public open fun triggerResourceUpdateOn(`value`: String) {
    unwrap(this).setTriggerResourceUpdateOn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codestarconnections.CfnSyncConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The branch associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-branch)
     * @param branch The branch associated with a specific sync configuration. 
     */
    public fun branch(branch: String)

    /**
     * The file path to the configuration file associated with a specific sync configuration.
     *
     * The path should point to an actual file in the sync configurations linked repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-configfile)
     * @param configFile The file path to the configuration file associated with a specific sync
     * configuration. 
     */
    public fun configFile(configFile: String)

    /**
     * Whether to enable or disable publishing of deployment status to source providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-publishdeploymentstatus)
     * @param publishDeploymentStatus Whether to enable or disable publishing of deployment status
     * to source providers. 
     */
    public fun publishDeploymentStatus(publishDeploymentStatus: String)

    /**
     * The ID of the repository link associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-repositorylinkid)
     * @param repositoryLinkId The ID of the repository link associated with a specific sync
     * configuration. 
     */
    public fun repositoryLinkId(repositoryLinkId: String)

    /**
     * The name of the connection resource associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-resourcename)
     * @param resourceName The name of the connection resource associated with a specific sync
     * configuration. 
     */
    public fun resourceName(resourceName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
     * configuration. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The type of sync for a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-synctype)
     * @param syncType The type of sync for a specific sync configuration. 
     */
    public fun syncType(syncType: String)

    /**
     * When to trigger Git sync to begin the stack update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-triggerresourceupdateon)
     * @param triggerResourceUpdateOn When to trigger Git sync to begin the stack update. 
     */
    public fun triggerResourceUpdateOn(triggerResourceUpdateOn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration.Builder.create(scope,
        id)

    /**
     * The branch associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-branch)
     * @param branch The branch associated with a specific sync configuration. 
     */
    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    /**
     * The file path to the configuration file associated with a specific sync configuration.
     *
     * The path should point to an actual file in the sync configurations linked repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-configfile)
     * @param configFile The file path to the configuration file associated with a specific sync
     * configuration. 
     */
    override fun configFile(configFile: String) {
      cdkBuilder.configFile(configFile)
    }

    /**
     * Whether to enable or disable publishing of deployment status to source providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-publishdeploymentstatus)
     * @param publishDeploymentStatus Whether to enable or disable publishing of deployment status
     * to source providers. 
     */
    override fun publishDeploymentStatus(publishDeploymentStatus: String) {
      cdkBuilder.publishDeploymentStatus(publishDeploymentStatus)
    }

    /**
     * The ID of the repository link associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-repositorylinkid)
     * @param repositoryLinkId The ID of the repository link associated with a specific sync
     * configuration. 
     */
    override fun repositoryLinkId(repositoryLinkId: String) {
      cdkBuilder.repositoryLinkId(repositoryLinkId)
    }

    /**
     * The name of the connection resource associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-resourcename)
     * @param resourceName The name of the connection resource associated with a specific sync
     * configuration. 
     */
    override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
     * configuration. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The type of sync for a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-synctype)
     * @param syncType The type of sync for a specific sync configuration. 
     */
    override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    /**
     * When to trigger Git sync to begin the stack update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-triggerresourceupdateon)
     * @param triggerResourceUpdateOn When to trigger Git sync to begin the stack update. 
     */
    override fun triggerResourceUpdateOn(triggerResourceUpdateOn: String) {
      cdkBuilder.triggerResourceUpdateOn(triggerResourceUpdateOn)
    }

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSyncConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSyncConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration):
        CfnSyncConfiguration = CfnSyncConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSyncConfiguration):
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration = wrapped.cdkObject
        as software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration
  }
}
