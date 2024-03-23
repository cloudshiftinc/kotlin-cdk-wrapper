@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnResourceCollection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devopsguru.*;
 * CfnResourceCollectionProps cfnResourceCollectionProps = CfnResourceCollectionProps.builder()
 * .resourceCollectionFilter(ResourceCollectionFilterProperty.builder()
 * .cloudFormation(CloudFormationCollectionFilterProperty.builder()
 * .stackNames(List.of("stackNames"))
 * .build())
 * .tags(List.of(TagCollectionProperty.builder()
 * .appBoundaryKey("appBoundaryKey")
 * .tagValues(List.of("tagValues"))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html)
 */
public interface CfnResourceCollectionProps {
  /**
   * Information about a filter used to specify which AWS resources are analyzed for anomalous
   * behavior by DevOps Guru.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
   */
  public fun resourceCollectionFilter(): Any

  /**
   * A builder for [CfnResourceCollectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    public fun resourceCollectionFilter(resourceCollectionFilter: IResolvable)

    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    public
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty)

    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5adba42b517c5cdd37e652851ac3ba97844a2a650c7f0faa0c889b7e5d76c1")
    public
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps.Builder =
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps.builder()

    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    override fun resourceCollectionFilter(resourceCollectionFilter: IResolvable) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(IResolvable::unwrap))
    }

    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    override
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty) {
      cdkBuilder.resourceCollectionFilter(resourceCollectionFilter.let(CfnResourceCollection.ResourceCollectionFilterProperty::unwrap))
    }

    /**
     * @param resourceCollectionFilter Information about a filter used to specify which AWS
     * resources are analyzed for anomalous behavior by DevOps Guru. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5adba42b517c5cdd37e652851ac3ba97844a2a650c7f0faa0c889b7e5d76c1")
    override
        fun resourceCollectionFilter(resourceCollectionFilter: CfnResourceCollection.ResourceCollectionFilterProperty.Builder.() -> Unit):
        Unit =
        resourceCollectionFilter(CfnResourceCollection.ResourceCollectionFilterProperty(resourceCollectionFilter))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps,
  ) : CdkObject(cdkObject), CfnResourceCollectionProps {
    /**
     * Information about a filter used to specify which AWS resources are analyzed for anomalous
     * behavior by DevOps Guru.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-resourcecollection.html#cfn-devopsguru-resourcecollection-resourcecollectionfilter)
     */
    override fun resourceCollectionFilter(): Any = unwrap(this).getResourceCollectionFilter()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps):
        CfnResourceCollectionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnResourceCollectionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceCollectionProps):
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps
  }
}
