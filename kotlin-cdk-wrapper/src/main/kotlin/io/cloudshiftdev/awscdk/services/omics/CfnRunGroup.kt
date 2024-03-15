@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRunGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.omics.CfnRunGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxCpus(): Number? = unwrap(this).getMaxCpus()

  public open fun maxCpus(`value`: Number) {
    unwrap(this).setMaxCpus(`value`)
  }

  public open fun maxDuration(): Number? = unwrap(this).getMaxDuration()

  public open fun maxDuration(`value`: Number) {
    unwrap(this).setMaxDuration(`value`)
  }

  public open fun maxGpus(): Number? = unwrap(this).getMaxGpus()

  public open fun maxGpus(`value`: Number) {
    unwrap(this).setMaxGpus(`value`)
  }

  public open fun maxRuns(): Number? = unwrap(this).getMaxRuns()

  public open fun maxRuns(`value`: Number) {
    unwrap(this).setMaxRuns(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun maxCpus(maxCpus: Number)

    public fun maxDuration(maxDuration: Number)

    public fun maxGpus(maxGpus: Number)

    public fun maxRuns(maxRuns: Number)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnRunGroup.Builder =
        software.amazon.awscdk.services.omics.CfnRunGroup.Builder.create(scope, id)

    override fun maxCpus(maxCpus: Number) {
      cdkBuilder.maxCpus(maxCpus)
    }

    override fun maxDuration(maxDuration: Number) {
      cdkBuilder.maxDuration(maxDuration)
    }

    override fun maxGpus(maxGpus: Number) {
      cdkBuilder.maxGpus(maxGpus)
    }

    override fun maxRuns(maxRuns: Number) {
      cdkBuilder.maxRuns(maxRuns)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnRunGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnRunGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRunGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRunGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnRunGroup): CfnRunGroup =
        CfnRunGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRunGroup): software.amazon.awscdk.services.omics.CfnRunGroup =
        wrapped.cdkObject
  }
}
