@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAnomalyMonitorProps {
  public fun monitorDimension(): String? = unwrap(this).getMonitorDimension()

  public fun monitorName(): String

  public fun monitorSpecification(): String? = unwrap(this).getMonitorSpecification()

  public fun monitorType(): String

  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  @CdkDslMarker
  public interface Builder {
    public fun monitorDimension(monitorDimension: String)

    public fun monitorName(monitorName: String)

    public fun monitorSpecification(monitorSpecification: String)

    public fun monitorType(monitorType: String)

    public fun resourceTags(resourceTags: IResolvable)

    public fun resourceTags(resourceTags: List<Any>)

    public fun resourceTags(vararg resourceTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps.Builder =
        software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps,
  ) : CdkObject(cdkObject), CfnAnomalyMonitorProps {
    override fun monitorDimension(): String? = unwrap(this).getMonitorDimension()

    override fun monitorName(): String = unwrap(this).getMonitorName()

    override fun monitorSpecification(): String? = unwrap(this).getMonitorSpecification()

    override fun monitorType(): String = unwrap(this).getMonitorType()

    override fun resourceTags(): Any? = unwrap(this).getResourceTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalyMonitorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps):
        CfnAnomalyMonitorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyMonitorProps):
        software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps
  }
}
