@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emrcontainers

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVirtualCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emrcontainers.*;
 * CfnVirtualClusterProps cfnVirtualClusterProps = CfnVirtualClusterProps.builder()
 * .containerProvider(ContainerProviderProperty.builder()
 * .id("id")
 * .info(ContainerInfoProperty.builder()
 * .eksInfo(EksInfoProperty.builder()
 * .namespace("namespace")
 * .build())
 * .build())
 * .type("type")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html)
 */
public interface CfnVirtualClusterProps {
  /**
   * The container provider of the virtual cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
   */
  public fun containerProvider(): Any

  /**
   * The name of the virtual cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnVirtualClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerProvider The container provider of the virtual cluster. 
     */
    public fun containerProvider(containerProvider: IResolvable)

    /**
     * @param containerProvider The container provider of the virtual cluster. 
     */
    public fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty)

    /**
     * @param containerProvider The container provider of the virtual cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21f006f7212bf2fdda58e625ec41c39bdd61ebd027ec6834340284ffcac8263d")
    public
        fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty.Builder.() -> Unit)

    /**
     * @param name The name of the virtual cluster. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps.Builder =
        software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps.builder()

    /**
     * @param containerProvider The container provider of the virtual cluster. 
     */
    override fun containerProvider(containerProvider: IResolvable) {
      cdkBuilder.containerProvider(containerProvider.let(IResolvable::unwrap))
    }

    /**
     * @param containerProvider The container provider of the virtual cluster. 
     */
    override fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty) {
      cdkBuilder.containerProvider(containerProvider.let(CfnVirtualCluster.ContainerProviderProperty::unwrap))
    }

    /**
     * @param containerProvider The container provider of the virtual cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21f006f7212bf2fdda58e625ec41c39bdd61ebd027ec6834340284ffcac8263d")
    override
        fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty.Builder.() -> Unit):
        Unit = containerProvider(CfnVirtualCluster.ContainerProviderProperty(containerProvider))

    /**
     * @param name The name of the virtual cluster. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps,
  ) : CdkObject(cdkObject), CfnVirtualClusterProps {
    /**
     * The container provider of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-containerprovider)
     */
    override fun containerProvider(): Any = unwrap(this).getContainerProvider()

    /**
     * The name of the virtual cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrcontainers-virtualcluster.html#cfn-emrcontainers-virtualcluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps):
        CfnVirtualClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualClusterProps):
        software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps
  }
}
