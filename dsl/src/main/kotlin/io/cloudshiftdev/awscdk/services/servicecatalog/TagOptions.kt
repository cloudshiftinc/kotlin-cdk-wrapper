package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TagOptions internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptions,
) : Resource(cdkObject) {
  public interface Builder {
    public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.TagOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.TagOptions.Builder.create(scope, id)

    override fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
      cdkBuilder.allowedValuesForTags(allowedValuesForTags)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TagOptions =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
