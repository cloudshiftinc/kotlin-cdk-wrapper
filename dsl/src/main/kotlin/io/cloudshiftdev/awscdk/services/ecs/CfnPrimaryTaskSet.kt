package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPrimaryTaskSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun cluster(): String = unwrap(this).getCluster()

  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun service(): String = unwrap(this).getService()

  public open fun service(`value`: String) {
    unwrap(this).setService(`value`)
  }

  public open fun taskSetId(): String = unwrap(this).getTaskSetId()

  public open fun taskSetId(`value`: String) {
    unwrap(this).setTaskSetId(`value`)
  }

  public interface Builder {
    public fun cluster(cluster: String)

    public fun service(service: String)

    public fun taskSetId(taskSetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder =
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder.create(scope, id)

    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    override fun taskSetId(taskSetId: String) {
      cdkBuilder.taskSetId(taskSetId)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrimaryTaskSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrimaryTaskSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet):
        CfnPrimaryTaskSet = CfnPrimaryTaskSet(cdkObject)

    internal fun unwrap(wrapped: CfnPrimaryTaskSet):
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet = wrapped.cdkObject
  }
}
