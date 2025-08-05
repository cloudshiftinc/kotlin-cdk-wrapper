@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a set of TagOptions, which are a list of key-value pairs managed in AWS Service Catalog.
 *
 * It is not an AWS tag, but serves as a template for creating an AWS tag based on the TagOption.
 * See https://docs.aws.amazon.com/servicecatalog/latest/adminguide/tagoptions.html
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
public open class TagOptions(
  cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptions,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TagOptionsProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.TagOptions(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TagOptionsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TagOptionsProps.Builder.() -> Unit,
  ) : this(scope, id, TagOptionsProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.TagOptions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The values that are allowed to be set for specific tags.
     *
     * The keys of the map represent the tag keys,
     * and the values of the map are a list of allowed values for that particular tag key.
     *
     * @param allowedValuesForTags The values that are allowed to be set for specific tags. 
     */
    public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.TagOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.TagOptions.Builder.create(scope, id)

    /**
     * The values that are allowed to be set for specific tags.
     *
     * The keys of the map represent the tag keys,
     * and the values of the map are a list of allowed values for that particular tag key.
     *
     * @param allowedValuesForTags The values that are allowed to be set for specific tags. 
     */
    override fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
      cdkBuilder.allowedValuesForTags(allowedValuesForTags)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TagOptions =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.servicecatalog.TagOptions.PROPERTY_INJECTION_ID

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TagOptions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TagOptions(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptions):
        TagOptions = TagOptions(cdkObject)

    internal fun unwrap(wrapped: TagOptions):
        software.amazon.awscdk.services.servicecatalog.TagOptions = wrapped.cdkObject as
        software.amazon.awscdk.services.servicecatalog.TagOptions
  }
}
