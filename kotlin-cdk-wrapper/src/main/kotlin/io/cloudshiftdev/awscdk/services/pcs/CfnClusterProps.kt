@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcs.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
public interface CfnClusterProps {
  /**
   * The name that identifies the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The networking configuration for the cluster's control plane.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
   */
  public fun networking(): Any

  /**
   * The cluster management and job scheduling software associated with the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
   */
  public fun scheduler(): Any

  /**
   * The size of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-size)
   */
  public fun size(): String

  /**
   * Additional options related to the Slurm scheduler.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
   */
  public fun slurmConfiguration(): Any? = unwrap(this).getSlurmConfiguration()

  /**
   * 1 or more tags added to the resource.
   *
   * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
   * string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name that identifies the cluster.
     */
    public fun name(name: String)

    /**
     * @param networking The networking configuration for the cluster's control plane. 
     */
    public fun networking(networking: IResolvable)

    /**
     * @param networking The networking configuration for the cluster's control plane. 
     */
    public fun networking(networking: CfnCluster.NetworkingProperty)

    /**
     * @param networking The networking configuration for the cluster's control plane. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e13d9ecc68d67b33fc04d8e5d32d65f85b12a6839fde497f0a12d2a72a5baa0")
    public fun networking(networking: CfnCluster.NetworkingProperty.Builder.() -> Unit)

    /**
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    public fun scheduler(scheduler: IResolvable)

    /**
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    public fun scheduler(scheduler: CfnCluster.SchedulerProperty)

    /**
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6320173a99f49a79cce26c6ff76b7cb6721eda53cbc1c59a07688fe50d22b33b")
    public fun scheduler(scheduler: CfnCluster.SchedulerProperty.Builder.() -> Unit)

    /**
     * @param size The size of the cluster. 
     */
    public fun size(size: String)

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    public fun slurmConfiguration(slurmConfiguration: IResolvable)

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    public fun slurmConfiguration(slurmConfiguration: CfnCluster.SlurmConfigurationProperty)

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("921d3c94de13097507a7c678ec6dc5463c5807ba5371fd56e6671611b24e1059")
    public
        fun slurmConfiguration(slurmConfiguration: CfnCluster.SlurmConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags 1 or more tags added to the resource.
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnClusterProps.Builder =
        software.amazon.awscdk.services.pcs.CfnClusterProps.builder()

    /**
     * @param name The name that identifies the cluster.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networking The networking configuration for the cluster's control plane. 
     */
    override fun networking(networking: IResolvable) {
      cdkBuilder.networking(networking.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networking The networking configuration for the cluster's control plane. 
     */
    override fun networking(networking: CfnCluster.NetworkingProperty) {
      cdkBuilder.networking(networking.let(CfnCluster.NetworkingProperty.Companion::unwrap))
    }

    /**
     * @param networking The networking configuration for the cluster's control plane. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e13d9ecc68d67b33fc04d8e5d32d65f85b12a6839fde497f0a12d2a72a5baa0")
    override fun networking(networking: CfnCluster.NetworkingProperty.Builder.() -> Unit): Unit =
        networking(CfnCluster.NetworkingProperty(networking))

    /**
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    override fun scheduler(scheduler: IResolvable) {
      cdkBuilder.scheduler(scheduler.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    override fun scheduler(scheduler: CfnCluster.SchedulerProperty) {
      cdkBuilder.scheduler(scheduler.let(CfnCluster.SchedulerProperty.Companion::unwrap))
    }

    /**
     * @param scheduler The cluster management and job scheduling software associated with the
     * cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6320173a99f49a79cce26c6ff76b7cb6721eda53cbc1c59a07688fe50d22b33b")
    override fun scheduler(scheduler: CfnCluster.SchedulerProperty.Builder.() -> Unit): Unit =
        scheduler(CfnCluster.SchedulerProperty(scheduler))

    /**
     * @param size The size of the cluster. 
     */
    override fun size(size: String) {
      cdkBuilder.size(size)
    }

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    override fun slurmConfiguration(slurmConfiguration: IResolvable) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    override fun slurmConfiguration(slurmConfiguration: CfnCluster.SlurmConfigurationProperty) {
      cdkBuilder.slurmConfiguration(slurmConfiguration.let(CfnCluster.SlurmConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param slurmConfiguration Additional options related to the Slurm scheduler.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("921d3c94de13097507a7c678ec6dc5463c5807ba5371fd56e6671611b24e1059")
    override
        fun slurmConfiguration(slurmConfiguration: CfnCluster.SlurmConfigurationProperty.Builder.() -> Unit):
        Unit = slurmConfiguration(CfnCluster.SlurmConfigurationProperty(slurmConfiguration))

    /**
     * @param tags 1 or more tags added to the resource.
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcs.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pcs.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * The name that identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The networking configuration for the cluster's control plane.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-networking)
     */
    override fun networking(): Any = unwrap(this).getNetworking()

    /**
     * The cluster management and job scheduling software associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-scheduler)
     */
    override fun scheduler(): Any = unwrap(this).getScheduler()

    /**
     * The size of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-size)
     */
    override fun size(): String = unwrap(this).getSize()

    /**
     * Additional options related to the Slurm scheduler.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-slurmconfiguration)
     */
    override fun slurmConfiguration(): Any? = unwrap(this).getSlurmConfiguration()

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-cluster.html#cfn-pcs-cluster-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.pcs.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.pcs.CfnClusterProps
  }
}
