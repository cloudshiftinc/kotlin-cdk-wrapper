@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrackerConsumer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumer,
) : CfnResource(cdkObject), IInspectable {
  public open fun consumerArn(): String = unwrap(this).getConsumerArn()

  public open fun consumerArn(`value`: String) {
    unwrap(this).setConsumerArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun trackerName(): String = unwrap(this).getTrackerName()

  public open fun trackerName(`value`: String) {
    unwrap(this).setTrackerName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun consumerArn(consumerArn: String)

    public fun trackerName(trackerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTrackerConsumer.Builder =
        software.amazon.awscdk.services.location.CfnTrackerConsumer.Builder.create(scope, id)

    override fun consumerArn(consumerArn: String) {
      cdkBuilder.consumerArn(consumerArn)
    }

    override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTrackerConsumer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnTrackerConsumer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrackerConsumer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrackerConsumer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTrackerConsumer):
        CfnTrackerConsumer = CfnTrackerConsumer(cdkObject)

    internal fun unwrap(wrapped: CfnTrackerConsumer):
        software.amazon.awscdk.services.location.CfnTrackerConsumer = wrapped.cdkObject
  }
}
