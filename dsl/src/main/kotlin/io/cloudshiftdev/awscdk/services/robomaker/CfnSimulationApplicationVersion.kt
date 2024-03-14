package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSimulationApplicationVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun application(): String = unwrap(this).getApplication()

  public open fun application(`value`: String) {
    unwrap(this).setApplication(`value`)
  }

  public open fun attrApplicationVersion(): String = unwrap(this).getAttrApplicationVersion()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  public open fun currentRevisionId(`value`: String) {
    unwrap(this).setCurrentRevisionId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun application(application: String)

    public fun currentRevisionId(currentRevisionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.Builder.create(scope,
        id)

    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimulationApplicationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimulationApplicationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion):
        CfnSimulationApplicationVersion = CfnSimulationApplicationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationApplicationVersion):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion =
        wrapped.cdkObject
  }
}
