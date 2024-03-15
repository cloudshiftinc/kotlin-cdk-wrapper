@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnScheduleProps {
  public fun cronExpression(): String

  public fun jobNames(): List<String> = unwrap(this).getJobNames() ?: emptyList()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun cronExpression(cronExpression: String)

    public fun jobNames(jobNames: List<String>)

    public fun jobNames(vararg jobNames: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnScheduleProps.Builder =
        software.amazon.awscdk.services.databrew.CfnScheduleProps.builder()

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

    public fun build(): software.amazon.awscdk.services.databrew.CfnScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnScheduleProps,
  ) : CdkObject(cdkObject), CfnScheduleProps {
    override fun cronExpression(): String = unwrap(this).getCronExpression()

    override fun jobNames(): List<String> = unwrap(this).getJobNames() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnScheduleProps):
        CfnScheduleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduleProps):
        software.amazon.awscdk.services.databrew.CfnScheduleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnScheduleProps
  }
}
