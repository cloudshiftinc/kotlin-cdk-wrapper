package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogAnomalyDetectionIntegration internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration.Builder =
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration.Builder.create(scope,
        id)

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogAnomalyDetectionIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogAnomalyDetectionIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration):
        CfnLogAnomalyDetectionIntegration = CfnLogAnomalyDetectionIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnLogAnomalyDetectionIntegration):
        software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration =
        wrapped.cdkObject
  }
}
