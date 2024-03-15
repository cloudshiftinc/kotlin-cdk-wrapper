@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchedule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.databrew.CfnSchedule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun cronExpression(): String = unwrap(this).getCronExpression()

  public open fun cronExpression(`value`: String) {
    unwrap(this).setCronExpression(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobNames(): List<String> = unwrap(this).getJobNames() ?: emptyList()

  public open fun jobNames(`value`: List<String>) {
    unwrap(this).setJobNames(`value`)
  }

  public open fun jobNames(vararg `value`: String): Unit = jobNames(`value`.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun cronExpression(cronExpression: String)

    public fun jobNames(jobNames: List<String>)

    public fun jobNames(vararg jobNames: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnSchedule.Builder =
        software.amazon.awscdk.services.databrew.CfnSchedule.Builder.create(scope, id)

    override fun cronExpression(cronExpression: String) {
      cdkBuilder.cronExpression(cronExpression)
    }

    override fun jobNames(jobNames: List<String>) {
      cdkBuilder.jobNames(jobNames)
    }

    override fun jobNames(vararg jobNames: String): Unit = jobNames(jobNames.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnSchedule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.databrew.CfnSchedule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnSchedule): CfnSchedule
        = CfnSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnSchedule): software.amazon.awscdk.services.databrew.CfnSchedule
        = wrapped.cdkObject
  }
}
