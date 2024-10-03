@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

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
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
 * .clusterType("clusterType")
 * .instanceRoleArn("instanceRoleArn")
 * .name("name")
 * .networkSettings(ClusterNetworkSettingsProperty.builder()
 * .defaultRoute("defaultRoute")
 * .interfaceMappings(List.of(InterfaceMappingProperty.builder()
 * .logicalInterfaceName("logicalInterfaceName")
 * .networkId("networkId")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html)
 */
public interface CfnClusterProps {
  /**
   * The hardware type for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-clustertype)
   */
  public fun clusterType(): String? = unwrap(this).getClusterType()

  /**
   * The IAM role your nodes will use.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-instancerolearn)
   */
  public fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

  /**
   * The user-specified name of the Cluster to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * On premises settings which will have the interface network mappings and default Output logical
   * interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
   */
  public fun networkSettings(): Any? = unwrap(this).getNetworkSettings()

  /**
   * A collection of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterType The hardware type for the cluster.
     */
    public fun clusterType(clusterType: String)

    /**
     * @param instanceRoleArn The IAM role your nodes will use.
     */
    public fun instanceRoleArn(instanceRoleArn: String)

    /**
     * @param name The user-specified name of the Cluster to be created.
     */
    public fun name(name: String)

    /**
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface.
     */
    public fun networkSettings(networkSettings: IResolvable)

    /**
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface.
     */
    public fun networkSettings(networkSettings: CfnCluster.ClusterNetworkSettingsProperty)

    /**
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e6feeb696e44accdf7439e2e9958c9655890d4476c754a23072dd8f26ab96fd")
    public
        fun networkSettings(networkSettings: CfnCluster.ClusterNetworkSettingsProperty.Builder.() -> Unit)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnClusterProps.Builder =
        software.amazon.awscdk.services.medialive.CfnClusterProps.builder()

    /**
     * @param clusterType The hardware type for the cluster.
     */
    override fun clusterType(clusterType: String) {
      cdkBuilder.clusterType(clusterType)
    }

    /**
     * @param instanceRoleArn The IAM role your nodes will use.
     */
    override fun instanceRoleArn(instanceRoleArn: String) {
      cdkBuilder.instanceRoleArn(instanceRoleArn)
    }

    /**
     * @param name The user-specified name of the Cluster to be created.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface.
     */
    override fun networkSettings(networkSettings: IResolvable) {
      cdkBuilder.networkSettings(networkSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface.
     */
    override fun networkSettings(networkSettings: CfnCluster.ClusterNetworkSettingsProperty) {
      cdkBuilder.networkSettings(networkSettings.let(CfnCluster.ClusterNetworkSettingsProperty.Companion::unwrap))
    }

    /**
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e6feeb696e44accdf7439e2e9958c9655890d4476c754a23072dd8f26ab96fd")
    override
        fun networkSettings(networkSettings: CfnCluster.ClusterNetworkSettingsProperty.Builder.() -> Unit):
        Unit = networkSettings(CfnCluster.ClusterNetworkSettingsProperty(networkSettings))

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * The hardware type for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-clustertype)
     */
    override fun clusterType(): String? = unwrap(this).getClusterType()

    /**
     * The IAM role your nodes will use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-instancerolearn)
     */
    override fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

    /**
     * The user-specified name of the Cluster to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * On premises settings which will have the interface network mappings and default Output
     * logical interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
     */
    override fun networkSettings(): Any? = unwrap(this).getNetworkSettings()

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.medialive.CfnClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.medialive.CfnClusterProps
  }
}
