@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnArchiveProps {
  public fun archiveName(): String? = unwrap(this).getArchiveName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun eventPattern(): Any? = unwrap(this).getEventPattern()

  public fun retentionDays(): Number? = unwrap(this).getRetentionDays()

  public fun sourceArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun archiveName(archiveName: String)

    public fun description(description: String)

    public fun eventPattern(eventPattern: Any)

    public fun retentionDays(retentionDays: Number)

    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnArchiveProps.Builder =
        software.amazon.awscdk.services.events.CfnArchiveProps.builder()

    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventPattern(eventPattern: Any) {
      cdkBuilder.eventPattern(eventPattern)
    }

    override fun retentionDays(retentionDays: Number) {
      cdkBuilder.retentionDays(retentionDays)
    }

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnArchiveProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnArchiveProps,
  ) : CdkObject(cdkObject), CfnArchiveProps {
    override fun archiveName(): String? = unwrap(this).getArchiveName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): Any? = unwrap(this).getEventPattern()

    override fun retentionDays(): Number? = unwrap(this).getRetentionDays()

    override fun sourceArn(): String = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnArchiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnArchiveProps):
        CfnArchiveProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnArchiveProps):
        software.amazon.awscdk.services.events.CfnArchiveProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.CfnArchiveProps
  }
}
