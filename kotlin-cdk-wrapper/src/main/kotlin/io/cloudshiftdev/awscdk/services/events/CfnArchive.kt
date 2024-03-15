@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnArchive internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.CfnArchive,
) : CfnResource(cdkObject), IInspectable {
  public open fun archiveName(): String? = unwrap(this).getArchiveName()

  public open fun archiveName(`value`: String) {
    unwrap(this).setArchiveName(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventPattern(): Any? = unwrap(this).getEventPattern()

  public open fun eventPattern(`value`: Any) {
    unwrap(this).setEventPattern(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun retentionDays(): Number? = unwrap(this).getRetentionDays()

  public open fun retentionDays(`value`: Number) {
    unwrap(this).setRetentionDays(`value`)
  }

  public open fun sourceArn(): String = unwrap(this).getSourceArn()

  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun archiveName(archiveName: String)

    public fun description(description: String)

    public fun eventPattern(eventPattern: Any)

    public fun retentionDays(retentionDays: Number)

    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnArchive.Builder =
        software.amazon.awscdk.services.events.CfnArchive.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.events.CfnArchive = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnArchive.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnArchive {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnArchive(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnArchive): CfnArchive =
        CfnArchive(cdkObject)

    internal fun unwrap(wrapped: CfnArchive): software.amazon.awscdk.services.events.CfnArchive =
        wrapped.cdkObject
  }
}
