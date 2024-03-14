package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnomalyMonitor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitor,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  public open fun attrDimensionalValueCount(): Number = unwrap(this).getAttrDimensionalValueCount()

  public open fun attrLastEvaluatedDate(): String = unwrap(this).getAttrLastEvaluatedDate()

  public open fun attrLastUpdatedDate(): String = unwrap(this).getAttrLastUpdatedDate()

  public open fun attrMonitorArn(): String = unwrap(this).getAttrMonitorArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun monitorDimension(): String? = unwrap(this).getMonitorDimension()

  public open fun monitorDimension(`value`: String) {
    unwrap(this).setMonitorDimension(`value`)
  }

  public open fun monitorName(): String = unwrap(this).getMonitorName()

  public open fun monitorName(`value`: String) {
    unwrap(this).setMonitorName(`value`)
  }

  public open fun monitorSpecification(): String? = unwrap(this).getMonitorSpecification()

  public open fun monitorSpecification(`value`: String) {
    unwrap(this).setMonitorSpecification(`value`)
  }

  public open fun monitorType(): String = unwrap(this).getMonitorType()

  public open fun monitorType(`value`: String) {
    unwrap(this).setMonitorType(`value`)
  }

  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceTags(__idx_ac66f0)
  }

  public open fun resourceTags(vararg __idx_ac66f0: Any): Unit = resourceTags(__idx_ac66f0.toList())

  public interface Builder {
    public fun monitorDimension(monitorDimension: String)

    public fun monitorName(monitorName: String)

    public fun monitorSpecification(monitorSpecification: String)

    public fun monitorType(monitorType: String)

    public fun resourceTags(resourceTags: IResolvable)

    public fun resourceTags(resourceTags: List<Any>)

    public fun resourceTags(vararg resourceTags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalyMonitor.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalyMonitor.Builder.create(scope, id)

    override fun monitorDimension(monitorDimension: String) {
      cdkBuilder.monitorDimension(monitorDimension)
    }

    override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    override fun monitorSpecification(monitorSpecification: String) {
      cdkBuilder.monitorSpecification(monitorSpecification)
    }

    override fun monitorType(monitorType: String) {
      cdkBuilder.monitorType(monitorType)
    }

    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalyMonitor = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnomalyMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnomalyMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitor):
        CfnAnomalyMonitor = CfnAnomalyMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyMonitor):
        software.amazon.awscdk.services.ce.CfnAnomalyMonitor = wrapped.cdkObject
  }

  public interface ResourceTagProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty,
    ) : ResourceTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty):
          ResourceTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.ce.CfnAnomalyMonitor.ResourceTagProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
