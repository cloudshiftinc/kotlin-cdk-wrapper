@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Wait internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Wait,
) : State(cdkObject), INextable {
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun stateName(stateName: String)

    public fun time(time: WaitTime)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Wait.Builder =
        software.amazon.awscdk.services.stepfunctions.Wait.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun time(time: WaitTime) {
      cdkBuilder.time(time.let(WaitTime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Wait = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Wait {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Wait(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Wait): Wait =
        Wait(cdkObject)

    internal fun unwrap(wrapped: Wait): software.amazon.awscdk.services.stepfunctions.Wait =
        wrapped.cdkObject
  }
}
