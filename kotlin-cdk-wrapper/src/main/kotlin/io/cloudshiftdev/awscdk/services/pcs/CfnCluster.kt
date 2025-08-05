@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::PCS::Cluster` resource creates an AWS PCS cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcs.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .networking(NetworkingProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .scheduler(SchedulerProperty.builder()
 * .type("type")
 * .version("version")
 * .build())
 * .size("size")
 * // the properties below are optional
 * .name("name")
 * .slurmConfiguration(SlurmConfigurationProperty.builder()
 * .accounting(AccountingProperty.builder()
 * .mode("mode")
 * // the properties below are optional
 * .defaultPurgeTimeInDays(123)
 * .build())
 * .authKey(AuthKeyProperty.builder()
 * .secretArn("secretArn")
 * .secretVersion("secretVersion")
 * .build())
 * .scaleDownIdleTimeInSeconds(123)
 * .slurmCustomSettings(List.of(SlurmCustomSettingProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html)
 */
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.pcs.CfnCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.pcs.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * The unique Amazon Resource Name (ARN) of the cluster.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The list of endpoints available for interaction with the scheduler.
   */
  public open fun attrEndpoints(): IResolvable =
      unwrap(this).getAttrEndpoints().let(IResolvable::wrap)

  /**
   * The list of errors that occurred during cluster provisioning.
   */
  public open fun attrErrorInfo(): IResolvable =
      unwrap(this).getAttrErrorInfo().let(IResolvable::wrap)

  /**
   * The generated unique ID of the cluster.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The provisioning status of the cluster.
   *
   * The provisioning status doesn't indicate the overall health of the cluster.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name that identifies the cluster.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name that identifies the cluster.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The networking configuration for the cluster's control plane.
   */
  public open fun networking(): Any = unwrap(this).getNetworking()

  /**
   * The networking configuration for the cluster's control plane.
   */
  public open fun networking(`value`: IResolvable) {
    unwrap(this).setNetworking(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The networking configuration for the cluster's control plane.
   */
  public open fun networking(`value`: NetworkingProperty) {
    unwrap(this).setNetworking(`value`.let(NetworkingProperty.Companion::unwrap))
  }

  /**
   * The networking configuration for the cluster's control plane.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("85a72a21bdf0f4c6f5dbe096c205c33a7d7fb063128e3584b2e2b68558ac27c2")
  public open fun networking(`value`: NetworkingProperty.Builder.() -> Unit): Unit =
      networking(NetworkingProperty(`value`))

  /**
   * The cluster management and job scheduling software associated with the cluster.
   */
  public open fun scheduler(): Any = unwrap(this).getScheduler()

  /**
   * The cluster management and job scheduling software associated with the cluster.
   */
  public open fun scheduler(`value`: IResolvable) {
    unwrap(this).setScheduler(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The cluster management and job scheduling software associated with the cluster.
   */
  public open fun scheduler(`value`: SchedulerProperty) {
    unwrap(this).setScheduler(`value`.let(SchedulerProperty.Companion::unwrap))
  }

  /**
   * The cluster management and job scheduling software associated with the cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ee19125aa4f14100f5daecb6ee68d7bda41f9708558da2828c8931e3090515f")
  public open fun scheduler(`value`: SchedulerProperty.Builder.() -> Unit): Unit =
      scheduler(SchedulerProperty(`value`))

  /**
   * The size of the cluster.
   */
  public open fun size(): String = unwrap(this).getSize()

  /**
   * The size of the cluster.
   */
  public open fun size(`value`: String) {
    unwrap(this).setSize(`value`)
  }

  /**
   * Additional options related to the Slurm scheduler.
   */
  public open fun slurmConfiguration(): Any? = unwrap(this).getSlurmConfiguration()

  /**
   * Additional options related to the Slurm scheduler.
   */
  public open fun slurmConfiguration(`value`: IResolvable) {
    unwrap(this).setSlurmConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Additional options related to the Slurm scheduler.
   */
  public open fun slurmConfiguration(`value`: SlurmConfigurationProperty) {
    unwrap(this).setSlurmConfiguration(`value`.let(SlurmConfigurationProperty.Companion::unwrap))
  }

  /**
   * Additional options related to the Slurm scheduler.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9fbeb3c411d4933e19c167ff272847aa7304527697940e69aef2d1a0937a1ba9")
  public open fun slurmConfiguration(`value`: SlurmConfigurationProperty.Builder.() -> Unit): Unit =
      slurmConfiguration(SlurmConfigurationProperty(`value`))

  /**
   * 1 or more tags added to the resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * 1 or more tags added to the resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcs.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name that identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-name)
     * @param name The name that identifies the cluster. 
     */
    public fun name(name: String)

    /**
     * The networking configuration for the cluster's control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
     * @param networking The networking configuration for the cluster's control plane. 
     */
    public fun networking(networking: IResolvable)

    /**
     * The networking configuration for the cluster's control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
     * @param networking The networking configuration for the cluster's control plane. 
     */
    public fun networking(networking: NetworkingProperty)

    /**
     * The networking configuration for the cluster's control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
     * @param networking The networking configuration for the cluster's control plane. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccc825c9cff6cecae39886102f96ea63b5ce7796a5ef859d0583b71bd02241c2")
    public fun networking(networking: NetworkingProperty.Builder.() -> Unit)

    /**
     * The cluster management and job scheduling software associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    public fun scheduler(scheduler: IResolvable)

    /**
     * The cluster management and job scheduling software associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    public fun scheduler(scheduler: SchedulerProperty)

    /**
     * The cluster management and job scheduling software associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99201b26fba899e78de2f42a38daf3a4c32468a6aeb0c5d080fbe2579e0a3519")
    public fun scheduler(scheduler: SchedulerProperty.Builder.() -> Unit)

    /**
     * The size of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-size)
     * @param size The size of the cluster. 
     */
    public fun size(size: String)

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    public fun slurmConfiguration(slurmConfiguration: IResolvable)

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    public fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty)

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe233c809805f130d4d9a3d01856c11faed79e2734dd5de08f0f808fc96a7382")
    public fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty.Builder.() -> Unit)

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-tags)
     * @param tags 1 or more tags added to the resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnCluster.Builder =
        software.amazon.awscdk.services.pcs.CfnCluster.Builder.create(scope, id)

    /**
     * The name that identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-name)
     * @param name The name that identifies the cluster. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The networking configuration for the cluster's control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
     * @param networking The networking configuration for the cluster's control plane. 
     */
    override fun networking(networking: IResolvable) {
      cdkBuilder.networking(networking.let(IResolvable.Companion::unwrap))
    }

    /**
     * The networking configuration for the cluster's control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
     * @param networking The networking configuration for the cluster's control plane. 
     */
    override fun networking(networking: NetworkingProperty) {
      cdkBuilder.networking(networking.let(NetworkingProperty.Companion::unwrap))
    }

    /**
     * The networking configuration for the cluster's control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
     * @param networking The networking configuration for the cluster's control plane. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccc825c9cff6cecae39886102f96ea63b5ce7796a5ef859d0583b71bd02241c2")
    override fun networking(networking: NetworkingProperty.Builder.() -> Unit): Unit =
        networking(NetworkingProperty(networking))

    /**
     * The cluster management and job scheduling software associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    override fun scheduler(scheduler: IResolvable) {
      cdkBuilder.scheduler(scheduler.let(IResolvable.Companion::unwrap))
    }

    /**
     * The cluster management and job scheduling software associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    override fun scheduler(scheduler: SchedulerProperty) {
      cdkBuilder.scheduler(scheduler.let(SchedulerProperty.Companion::unwrap))
    }

    /**
     * The cluster management and job scheduling software associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99201b26fba899e78de2f42a38daf3a4c32468a6aeb0c5d080fbe2579e0a3519")
    override fun scheduler(scheduler: SchedulerProperty.Builder.() -> Unit): Unit =
        scheduler(SchedulerProperty(scheduler))

    /**
     * The size of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-size)
     * @param size The size of the cluster. 
     */
    override fun size(size: String) {
      cdkBuilder.size(size)
    }

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    override fun slurmConfiguration(slurmConfiguration: IResolvable) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    override fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(SlurmConfigurationProperty.Companion::unwrap))
    }

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
     * @param slurmConfiguration Additional options related to the Slurm scheduler. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe233c809805f130d4d9a3d01856c11faed79e2734dd5de08f0f808fc96a7382")
    override
        fun slurmConfiguration(slurmConfiguration: SlurmConfigurationProperty.Builder.() -> Unit):
        Unit = slurmConfiguration(SlurmConfigurationProperty(slurmConfiguration))

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-tags)
     * @param tags 1 or more tags added to the resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcs.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcs.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.pcs.CfnCluster =
        wrapped.cdkObject as software.amazon.awscdk.services.pcs.CfnCluster
  }

  /**
   * The accounting configuration includes configurable settings for Slurm accounting.
   *
   * It's a property of the `ClusterSlurmConfiguration` object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * AccountingProperty accountingProperty = AccountingProperty.builder()
   * .mode("mode")
   * // the properties below are optional
   * .defaultPurgeTimeInDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-accounting.html)
   */
  public interface AccountingProperty {
    /**
     * The default value for all purge settings for `slurmdbd.conf` . For more information, see the
     * [slurmdbd.conf documentation at
     * SchedMD](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurmdbd.conf.html) .
     *
     * The default value `-1` means there is no purge time and records persist as long as the
     * cluster exists.
     *
     *
     * `0` isn't a valid value.
     *
     *
     * Default: - -1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-accounting.html#cfn-pcs-cluster-accounting-defaultpurgetimeindays)
     */
    public fun defaultPurgeTimeInDays(): Number? = unwrap(this).getDefaultPurgeTimeInDays()

    /**
     * The default value for `mode` is `STANDARD` .
     *
     * A value of `STANDARD` means Slurm accounting is enabled.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-accounting.html#cfn-pcs-cluster-accounting-mode)
     */
    public fun mode(): String

    /**
     * A builder for [AccountingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultPurgeTimeInDays The default value for all purge settings for `slurmdbd.conf`
       * . For more information, see the [slurmdbd.conf documentation at
       * SchedMD](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurmdbd.conf.html) .
       * The default value `-1` means there is no purge time and records persist as long as the
       * cluster exists.
       *
       *
       * `0` isn't a valid value.
       */
      public fun defaultPurgeTimeInDays(defaultPurgeTimeInDays: Number)

      /**
       * @param mode The default value for `mode` is `STANDARD` . 
       * A value of `STANDARD` means Slurm accounting is enabled.
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnCluster.AccountingProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnCluster.AccountingProperty.builder()

      /**
       * @param defaultPurgeTimeInDays The default value for all purge settings for `slurmdbd.conf`
       * . For more information, see the [slurmdbd.conf documentation at
       * SchedMD](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurmdbd.conf.html) .
       * The default value `-1` means there is no purge time and records persist as long as the
       * cluster exists.
       *
       *
       * `0` isn't a valid value.
       */
      override fun defaultPurgeTimeInDays(defaultPurgeTimeInDays: Number) {
        cdkBuilder.defaultPurgeTimeInDays(defaultPurgeTimeInDays)
      }

      /**
       * @param mode The default value for `mode` is `STANDARD` . 
       * A value of `STANDARD` means Slurm accounting is enabled.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.AccountingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.AccountingProperty,
    ) : CdkObject(cdkObject),
        AccountingProperty {
      /**
       * The default value for all purge settings for `slurmdbd.conf` . For more information, see
       * the [slurmdbd.conf documentation at
       * SchedMD](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurmdbd.conf.html) .
       *
       * The default value `-1` means there is no purge time and records persist as long as the
       * cluster exists.
       *
       *
       * `0` isn't a valid value.
       *
       *
       * Default: - -1
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-accounting.html#cfn-pcs-cluster-accounting-defaultpurgetimeindays)
       */
      override fun defaultPurgeTimeInDays(): Number? = unwrap(this).getDefaultPurgeTimeInDays()

      /**
       * The default value for `mode` is `STANDARD` .
       *
       * A value of `STANDARD` means Slurm accounting is enabled.
       *
       * Default: - "NONE"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-accounting.html#cfn-pcs-cluster-accounting-mode)
       */
      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccountingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.AccountingProperty):
          AccountingProperty = CdkObjectWrappers.wrap(cdkObject) as? AccountingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountingProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.AccountingProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnCluster.AccountingProperty
    }
  }

  /**
   * The shared Slurm key for authentication, also known as the *cluster secret* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * AuthKeyProperty authKeyProperty = AuthKeyProperty.builder()
   * .secretArn("secretArn")
   * .secretVersion("secretVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-authkey.html)
   */
  public interface AuthKeyProperty {
    /**
     * The Amazon Resource Name (ARN) of the shared Slurm key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-authkey.html#cfn-pcs-cluster-authkey-secretarn)
     */
    public fun secretArn(): String

    /**
     * The version of the shared Slurm key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-authkey.html#cfn-pcs-cluster-authkey-secretversion)
     */
    public fun secretVersion(): String

    /**
     * A builder for [AuthKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretArn The Amazon Resource Name (ARN) of the shared Slurm key. 
       */
      public fun secretArn(secretArn: String)

      /**
       * @param secretVersion The version of the shared Slurm key. 
       */
      public fun secretVersion(secretVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnCluster.AuthKeyProperty.Builder
          = software.amazon.awscdk.services.pcs.CfnCluster.AuthKeyProperty.builder()

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the shared Slurm key. 
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param secretVersion The version of the shared Slurm key. 
       */
      override fun secretVersion(secretVersion: String) {
        cdkBuilder.secretVersion(secretVersion)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.AuthKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.AuthKeyProperty,
    ) : CdkObject(cdkObject),
        AuthKeyProperty {
      /**
       * The Amazon Resource Name (ARN) of the shared Slurm key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-authkey.html#cfn-pcs-cluster-authkey-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * The version of the shared Slurm key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-authkey.html#cfn-pcs-cluster-authkey-secretversion)
       */
      override fun secretVersion(): String = unwrap(this).getSecretVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.AuthKeyProperty):
          AuthKeyProperty = CdkObjectWrappers.wrap(cdkObject) as? AuthKeyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthKeyProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.AuthKeyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnCluster.AuthKeyProperty
    }
  }

  /**
   * An endpoint available for interaction with the scheduler.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * EndpointProperty endpointProperty = EndpointProperty.builder()
   * .port("port")
   * .privateIpAddress("privateIpAddress")
   * .type("type")
   * // the properties below are optional
   * .publicIpAddress("publicIpAddress")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html)
   */
  public interface EndpointProperty {
    /**
     * The endpoint's connection port number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-port)
     */
    public fun port(): String

    /**
     * The endpoint's private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-privateipaddress)
     */
    public fun privateIpAddress(): String

    /**
     * The endpoint's public IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-publicipaddress)
     */
    public fun publicIpAddress(): String? = unwrap(this).getPublicIpAddress()

    /**
     * Indicates the type of endpoint running at the specific IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-type)
     */
    public fun type(): String

    /**
     * A builder for [EndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param port The endpoint's connection port number. 
       */
      public fun port(port: String)

      /**
       * @param privateIpAddress The endpoint's private IP address. 
       */
      public fun privateIpAddress(privateIpAddress: String)

      /**
       * @param publicIpAddress The endpoint's public IP address.
       */
      public fun publicIpAddress(publicIpAddress: String)

      /**
       * @param type Indicates the type of endpoint running at the specific IP address. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnCluster.EndpointProperty.builder()

      /**
       * @param port The endpoint's connection port number. 
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      /**
       * @param privateIpAddress The endpoint's private IP address. 
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      /**
       * @param publicIpAddress The endpoint's public IP address.
       */
      override fun publicIpAddress(publicIpAddress: String) {
        cdkBuilder.publicIpAddress(publicIpAddress)
      }

      /**
       * @param type Indicates the type of endpoint running at the specific IP address. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.EndpointProperty,
    ) : CdkObject(cdkObject),
        EndpointProperty {
      /**
       * The endpoint's connection port number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-port)
       */
      override fun port(): String = unwrap(this).getPort()

      /**
       * The endpoint's private IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-privateipaddress)
       */
      override fun privateIpAddress(): String = unwrap(this).getPrivateIpAddress()

      /**
       * The endpoint's public IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-publicipaddress)
       */
      override fun publicIpAddress(): String? = unwrap(this).getPublicIpAddress()

      /**
       * Indicates the type of endpoint running at the specific IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-endpoint.html#cfn-pcs-cluster-endpoint-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.EndpointProperty):
          EndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.EndpointProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnCluster.EndpointProperty
    }
  }

  /**
   * An error that occurred during resource provisioning.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * ErrorInfoProperty errorInfoProperty = ErrorInfoProperty.builder()
   * .code("code")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-errorinfo.html)
   */
  public interface ErrorInfoProperty {
    /**
     * The short-form error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-errorinfo.html#cfn-pcs-cluster-errorinfo-code)
     */
    public fun code(): String? = unwrap(this).getCode()

    /**
     * The detailed error information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-errorinfo.html#cfn-pcs-cluster-errorinfo-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A builder for [ErrorInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The short-form error code.
       */
      public fun code(code: String)

      /**
       * @param message The detailed error information.
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnCluster.ErrorInfoProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnCluster.ErrorInfoProperty.builder()

      /**
       * @param code The short-form error code.
       */
      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      /**
       * @param message The detailed error information.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.ErrorInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.ErrorInfoProperty,
    ) : CdkObject(cdkObject),
        ErrorInfoProperty {
      /**
       * The short-form error code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-errorinfo.html#cfn-pcs-cluster-errorinfo-code)
       */
      override fun code(): String? = unwrap(this).getCode()

      /**
       * The detailed error information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-errorinfo.html#cfn-pcs-cluster-errorinfo-message)
       */
      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.ErrorInfoProperty):
          ErrorInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ErrorInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorInfoProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.ErrorInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnCluster.ErrorInfoProperty
    }
  }

  /**
   * TThe networking configuration for the cluster's control plane.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * NetworkingProperty networkingProperty = NetworkingProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-networking.html)
   */
  public interface NetworkingProperty {
    /**
     * The list of security group IDs associated with the Elastic Network Interface (ENI) created in
     * subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-networking.html#cfn-pcs-cluster-networking-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The list of subnet IDs where AWS PCS creates an Elastic Network Interface (ENI) to enable
     * communication between managed controllers and AWS PCS resources.
     *
     * The subnet must have an available IP address, cannot reside in AWS Outposts, AWS Wavelength,
     * or an AWS Local Zone. AWS PCS currently supports only 1 subnet in this list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-networking.html#cfn-pcs-cluster-networking-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [NetworkingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The list of security group IDs associated with the Elastic Network
       * Interface (ENI) created in subnets.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The list of security group IDs associated with the Elastic Network
       * Interface (ENI) created in subnets.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The list of subnet IDs where AWS PCS creates an Elastic Network Interface
       * (ENI) to enable communication between managed controllers and AWS PCS resources.
       * The subnet must have an available IP address, cannot reside in AWS Outposts, AWS
       * Wavelength, or an AWS Local Zone. AWS PCS currently supports only 1 subnet in this list.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The list of subnet IDs where AWS PCS creates an Elastic Network Interface
       * (ENI) to enable communication between managed controllers and AWS PCS resources.
       * The subnet must have an available IP address, cannot reside in AWS Outposts, AWS
       * Wavelength, or an AWS Local Zone. AWS PCS currently supports only 1 subnet in this list.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnCluster.NetworkingProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnCluster.NetworkingProperty.builder()

      /**
       * @param securityGroupIds The list of security group IDs associated with the Elastic Network
       * Interface (ENI) created in subnets.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The list of security group IDs associated with the Elastic Network
       * Interface (ENI) created in subnets.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The list of subnet IDs where AWS PCS creates an Elastic Network Interface
       * (ENI) to enable communication between managed controllers and AWS PCS resources.
       * The subnet must have an available IP address, cannot reside in AWS Outposts, AWS
       * Wavelength, or an AWS Local Zone. AWS PCS currently supports only 1 subnet in this list.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The list of subnet IDs where AWS PCS creates an Elastic Network Interface
       * (ENI) to enable communication between managed controllers and AWS PCS resources.
       * The subnet must have an available IP address, cannot reside in AWS Outposts, AWS
       * Wavelength, or an AWS Local Zone. AWS PCS currently supports only 1 subnet in this list.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.NetworkingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.NetworkingProperty,
    ) : CdkObject(cdkObject),
        NetworkingProperty {
      /**
       * The list of security group IDs associated with the Elastic Network Interface (ENI) created
       * in subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-networking.html#cfn-pcs-cluster-networking-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The list of subnet IDs where AWS PCS creates an Elastic Network Interface (ENI) to enable
       * communication between managed controllers and AWS PCS resources.
       *
       * The subnet must have an available IP address, cannot reside in AWS Outposts, AWS
       * Wavelength, or an AWS Local Zone. AWS PCS currently supports only 1 subnet in this list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-networking.html#cfn-pcs-cluster-networking-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.NetworkingProperty):
          NetworkingProperty = CdkObjectWrappers.wrap(cdkObject) as? NetworkingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkingProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.NetworkingProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnCluster.NetworkingProperty
    }
  }

  /**
   * The cluster management and job scheduling software associated with the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * SchedulerProperty schedulerProperty = SchedulerProperty.builder()
   * .type("type")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-scheduler.html)
   */
  public interface SchedulerProperty {
    /**
     * The software AWS PCS uses to manage cluster scaling and job scheduling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-scheduler.html#cfn-pcs-cluster-scheduler-type)
     */
    public fun type(): String

    /**
     * The version of the specified scheduling software that AWS PCS uses to manage cluster scaling
     * and job scheduling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-scheduler.html#cfn-pcs-cluster-scheduler-version)
     */
    public fun version(): String

    /**
     * A builder for [SchedulerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The software AWS PCS uses to manage cluster scaling and job scheduling. 
       */
      public fun type(type: String)

      /**
       * @param version The version of the specified scheduling software that AWS PCS uses to manage
       * cluster scaling and job scheduling. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnCluster.SchedulerProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnCluster.SchedulerProperty.builder()

      /**
       * @param type The software AWS PCS uses to manage cluster scaling and job scheduling. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param version The version of the specified scheduling software that AWS PCS uses to manage
       * cluster scaling and job scheduling. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.SchedulerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.SchedulerProperty,
    ) : CdkObject(cdkObject),
        SchedulerProperty {
      /**
       * The software AWS PCS uses to manage cluster scaling and job scheduling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-scheduler.html#cfn-pcs-cluster-scheduler-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The version of the specified scheduling software that AWS PCS uses to manage cluster
       * scaling and job scheduling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-scheduler.html#cfn-pcs-cluster-scheduler-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchedulerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.SchedulerProperty):
          SchedulerProperty = CdkObjectWrappers.wrap(cdkObject) as? SchedulerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchedulerProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.SchedulerProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnCluster.SchedulerProperty
    }
  }

  /**
   * Additional options related to the Slurm scheduler.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * SlurmConfigurationProperty slurmConfigurationProperty = SlurmConfigurationProperty.builder()
   * .accounting(AccountingProperty.builder()
   * .mode("mode")
   * // the properties below are optional
   * .defaultPurgeTimeInDays(123)
   * .build())
   * .authKey(AuthKeyProperty.builder()
   * .secretArn("secretArn")
   * .secretVersion("secretVersion")
   * .build())
   * .scaleDownIdleTimeInSeconds(123)
   * .slurmCustomSettings(List.of(SlurmCustomSettingProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html)
   */
  public interface SlurmConfigurationProperty {
    /**
     * The accounting configuration includes configurable settings for Slurm accounting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-accounting)
     */
    public fun accounting(): Any? = unwrap(this).getAccounting()

    /**
     * The shared Slurm key for authentication, also known as the cluster secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-authkey)
     */
    public fun authKey(): Any? = unwrap(this).getAuthKey()

    /**
     * The time before an idle node is scaled down.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-scaledownidletimeinseconds)
     */
    public fun scaleDownIdleTimeInSeconds(): Number? = unwrap(this).getScaleDownIdleTimeInSeconds()

    /**
     * Additional Slurm-specific configuration that directly maps to Slurm settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-slurmcustomsettings)
     */
    public fun slurmCustomSettings(): Any? = unwrap(this).getSlurmCustomSettings()

    /**
     * A builder for [SlurmConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accounting The accounting configuration includes configurable settings for Slurm
       * accounting.
       */
      public fun accounting(accounting: IResolvable)

      /**
       * @param accounting The accounting configuration includes configurable settings for Slurm
       * accounting.
       */
      public fun accounting(accounting: AccountingProperty)

      /**
       * @param accounting The accounting configuration includes configurable settings for Slurm
       * accounting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e9362bb57ddb28a8b891e0e6a30ac7026f63d80c739b671309d24c2b663323a")
      public fun accounting(accounting: AccountingProperty.Builder.() -> Unit)

      /**
       * @param authKey The shared Slurm key for authentication, also known as the cluster secret.
       */
      public fun authKey(authKey: IResolvable)

      /**
       * @param authKey The shared Slurm key for authentication, also known as the cluster secret.
       */
      public fun authKey(authKey: AuthKeyProperty)

      /**
       * @param authKey The shared Slurm key for authentication, also known as the cluster secret.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a1f7277e60e47b2975e02afc7f6fcb2faf95e33f2d5f30f3763ff8cb3f9bc4a")
      public fun authKey(authKey: AuthKeyProperty.Builder.() -> Unit)

      /**
       * @param scaleDownIdleTimeInSeconds The time before an idle node is scaled down.
       */
      public fun scaleDownIdleTimeInSeconds(scaleDownIdleTimeInSeconds: Number)

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      public fun slurmCustomSettings(slurmCustomSettings: IResolvable)

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      public fun slurmCustomSettings(slurmCustomSettings: List<Any>)

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      public fun slurmCustomSettings(vararg slurmCustomSettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmConfigurationProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmConfigurationProperty.builder()

      /**
       * @param accounting The accounting configuration includes configurable settings for Slurm
       * accounting.
       */
      override fun accounting(accounting: IResolvable) {
        cdkBuilder.accounting(accounting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param accounting The accounting configuration includes configurable settings for Slurm
       * accounting.
       */
      override fun accounting(accounting: AccountingProperty) {
        cdkBuilder.accounting(accounting.let(AccountingProperty.Companion::unwrap))
      }

      /**
       * @param accounting The accounting configuration includes configurable settings for Slurm
       * accounting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e9362bb57ddb28a8b891e0e6a30ac7026f63d80c739b671309d24c2b663323a")
      override fun accounting(accounting: AccountingProperty.Builder.() -> Unit): Unit =
          accounting(AccountingProperty(accounting))

      /**
       * @param authKey The shared Slurm key for authentication, also known as the cluster secret.
       */
      override fun authKey(authKey: IResolvable) {
        cdkBuilder.authKey(authKey.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authKey The shared Slurm key for authentication, also known as the cluster secret.
       */
      override fun authKey(authKey: AuthKeyProperty) {
        cdkBuilder.authKey(authKey.let(AuthKeyProperty.Companion::unwrap))
      }

      /**
       * @param authKey The shared Slurm key for authentication, also known as the cluster secret.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a1f7277e60e47b2975e02afc7f6fcb2faf95e33f2d5f30f3763ff8cb3f9bc4a")
      override fun authKey(authKey: AuthKeyProperty.Builder.() -> Unit): Unit =
          authKey(AuthKeyProperty(authKey))

      /**
       * @param scaleDownIdleTimeInSeconds The time before an idle node is scaled down.
       */
      override fun scaleDownIdleTimeInSeconds(scaleDownIdleTimeInSeconds: Number) {
        cdkBuilder.scaleDownIdleTimeInSeconds(scaleDownIdleTimeInSeconds)
      }

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      override fun slurmCustomSettings(slurmCustomSettings: IResolvable) {
        cdkBuilder.slurmCustomSettings(slurmCustomSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      override fun slurmCustomSettings(slurmCustomSettings: List<Any>) {
        cdkBuilder.slurmCustomSettings(slurmCustomSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param slurmCustomSettings Additional Slurm-specific configuration that directly maps to
       * Slurm settings.
       */
      override fun slurmCustomSettings(vararg slurmCustomSettings: Any): Unit =
          slurmCustomSettings(slurmCustomSettings.toList())

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.SlurmConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.SlurmConfigurationProperty,
    ) : CdkObject(cdkObject),
        SlurmConfigurationProperty {
      /**
       * The accounting configuration includes configurable settings for Slurm accounting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-accounting)
       */
      override fun accounting(): Any? = unwrap(this).getAccounting()

      /**
       * The shared Slurm key for authentication, also known as the cluster secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-authkey)
       */
      override fun authKey(): Any? = unwrap(this).getAuthKey()

      /**
       * The time before an idle node is scaled down.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-scaledownidletimeinseconds)
       */
      override fun scaleDownIdleTimeInSeconds(): Number? =
          unwrap(this).getScaleDownIdleTimeInSeconds()

      /**
       * Additional Slurm-specific configuration that directly maps to Slurm settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmconfiguration.html#cfn-pcs-cluster-slurmconfiguration-slurmcustomsettings)
       */
      override fun slurmCustomSettings(): Any? = unwrap(this).getSlurmCustomSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlurmConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.SlurmConfigurationProperty):
          SlurmConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlurmConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlurmConfigurationProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmConfigurationProperty
    }
  }

  /**
   * Additional settings that directly map to Slurm settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * SlurmCustomSettingProperty slurmCustomSettingProperty = SlurmCustomSettingProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmcustomsetting.html)
   */
  public interface SlurmCustomSettingProperty {
    /**
     * AWS PCS supports configuration of the following Slurm parameters:.
     *
     * * For *clusters*
     * *
     * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
     * *
     * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
     * *
     * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
     * * For *compute node groups*
     * *
     * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
     * *
     * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmcustomsetting.html#cfn-pcs-cluster-slurmcustomsetting-parametername)
     */
    public fun parameterName(): String

    /**
     * The values for the configured Slurm settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmcustomsetting.html#cfn-pcs-cluster-slurmcustomsetting-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [SlurmCustomSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName AWS PCS supports configuration of the following Slurm parameters:. 
       * * For *clusters*
       * *
       * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
       * *
       * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
       * *
       * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
       * * For *compute node groups*
       * *
       * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       * *
       * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue The values for the configured Slurm settings. 
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmCustomSettingProperty.Builder =
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmCustomSettingProperty.builder()

      /**
       * @param parameterName AWS PCS supports configuration of the following Slurm parameters:. 
       * * For *clusters*
       * *
       * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
       * *
       * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
       * *
       * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
       * * For *compute node groups*
       * *
       * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       * *
       * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue The values for the configured Slurm settings. 
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnCluster.SlurmCustomSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.SlurmCustomSettingProperty,
    ) : CdkObject(cdkObject),
        SlurmCustomSettingProperty {
      /**
       * AWS PCS supports configuration of the following Slurm parameters:.
       *
       * * For *clusters*
       * *
       * [`Prolog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Prolog_1)
       * *
       * [`Epilog`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Epilog_1)
       * *
       * [`SelectTypeParameters`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_SelectTypeParameters)
       * * For *compute node groups*
       * *
       * [`Weight`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       * *
       * [`RealMemory`](https://docs.aws.amazon.com/https://slurm.schedmd.com/slurm.conf.html#OPT_Weight)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmcustomsetting.html#cfn-pcs-cluster-slurmcustomsetting-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()

      /**
       * The values for the configured Slurm settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-cluster-slurmcustomsetting.html#cfn-pcs-cluster-slurmcustomsetting-parametervalue)
       */
      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlurmCustomSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnCluster.SlurmCustomSettingProperty):
          SlurmCustomSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SlurmCustomSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlurmCustomSettingProperty):
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmCustomSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnCluster.SlurmCustomSettingProperty
    }
  }
}
