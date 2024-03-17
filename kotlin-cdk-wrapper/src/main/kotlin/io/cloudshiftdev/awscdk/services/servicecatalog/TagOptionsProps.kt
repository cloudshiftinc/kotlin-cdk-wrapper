@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for TagOptions.
 *
 * Example:
 *
 * ```
 * Portfolio portfolio;
 * CloudFormationProduct product;
 * TagOptions tagOptionsForPortfolio = TagOptions.Builder.create(this, "OrgTagOptions")
 * .allowedValuesForTags(Map.of(
 * "Group", List.of("finance", "engineering", "marketing", "research"),
 * "CostCenter", List.of("01", "02", "03")))
 * .build();
 * portfolio.associateTagOptions(tagOptionsForPortfolio);
 * TagOptions tagOptionsForProduct = TagOptions.Builder.create(this, "ProductTagOptions")
 * .allowedValuesForTags(Map.of(
 * "Environment", List.of("dev", "alpha", "prod")))
 * .build();
 * product.associateTagOptions(tagOptionsForProduct);
 * ```
 */
public interface TagOptionsProps {
  /**
   * The values that are allowed to be set for specific tags.
   *
   * The keys of the map represent the tag keys,
   * and the values of the map are a list of allowed values for that particular tag key.
   */
  public fun allowedValuesForTags(): Map<String, List<String>>

  /**
   * A builder for [TagOptionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedValuesForTags The values that are allowed to be set for specific tags. 
     * The keys of the map represent the tag keys,
     * and the values of the map are a list of allowed values for that particular tag key.
     */
    public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.TagOptionsProps.Builder =
        software.amazon.awscdk.services.servicecatalog.TagOptionsProps.builder()

    /**
     * @param allowedValuesForTags The values that are allowed to be set for specific tags. 
     * The keys of the map represent the tag keys,
     * and the values of the map are a list of allowed values for that particular tag key.
     */
    override fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
      cdkBuilder.allowedValuesForTags(allowedValuesForTags)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TagOptionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptionsProps,
  ) : CdkObject(cdkObject), TagOptionsProps {
    /**
     * The values that are allowed to be set for specific tags.
     *
     * The keys of the map represent the tag keys,
     * and the values of the map are a list of allowed values for that particular tag key.
     */
    override fun allowedValuesForTags(): Map<String, List<String>> =
        unwrap(this).getAllowedValuesForTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagOptionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptionsProps):
        TagOptionsProps = CdkObjectWrappers.wrap(cdkObject) as? TagOptionsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagOptionsProps):
        software.amazon.awscdk.services.servicecatalog.TagOptionsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.TagOptionsProps
  }
}
