package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TagOptions internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptions,
) : Resource(cdkObject) {
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
        software.amazon.awscdk.services.servicecatalog.TagOptions = wrapped.cdkObject
  }
}
