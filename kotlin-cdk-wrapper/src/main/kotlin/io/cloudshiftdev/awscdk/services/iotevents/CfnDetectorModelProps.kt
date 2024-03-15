@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDetectorModelProps {
  public fun detectorModelDefinition(): Any

  public fun detectorModelDescription(): String? = unwrap(this).getDetectorModelDescription()

  public fun detectorModelName(): String? = unwrap(this).getDetectorModelName()

  public fun evaluationMethod(): String? = unwrap(this).getEvaluationMethod()

  public fun key(): String? = unwrap(this).getKey()

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun detectorModelDefinition(detectorModelDefinition: IResolvable)

    public
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14304516dc6b8fc11c775d14439f15426e3de3adb330e3dde1412f6dbfe30b72")
    public
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty.Builder.() -> Unit)

    public fun detectorModelDescription(detectorModelDescription: String)

    public fun detectorModelName(detectorModelName: String)

    public fun evaluationMethod(evaluationMethod: String)

    public fun key(key: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnDetectorModelProps.Builder
        = software.amazon.awscdk.services.iotevents.CfnDetectorModelProps.builder()

    override fun detectorModelDefinition(detectorModelDefinition: IResolvable) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(IResolvable::unwrap))
    }

    override
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(CfnDetectorModel.DetectorModelDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14304516dc6b8fc11c775d14439f15426e3de3adb330e3dde1412f6dbfe30b72")
    override
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty.Builder.() -> Unit):
        Unit =
        detectorModelDefinition(CfnDetectorModel.DetectorModelDefinitionProperty(detectorModelDefinition))

    override fun detectorModelDescription(detectorModelDescription: String) {
      cdkBuilder.detectorModelDescription(detectorModelDescription)
    }

    override fun detectorModelName(detectorModelName: String) {
      cdkBuilder.detectorModelName(detectorModelName)
    }

    override fun evaluationMethod(evaluationMethod: String) {
      cdkBuilder.evaluationMethod(evaluationMethod)
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModelProps,
  ) : CdkObject(cdkObject), CfnDetectorModelProps {
    override fun detectorModelDefinition(): Any = unwrap(this).getDetectorModelDefinition()

    override fun detectorModelDescription(): String? = unwrap(this).getDetectorModelDescription()

    override fun detectorModelName(): String? = unwrap(this).getDetectorModelName()

    override fun evaluationMethod(): String? = unwrap(this).getEvaluationMethod()

    override fun key(): String? = unwrap(this).getKey()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDetectorModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModelProps):
        CfnDetectorModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorModelProps):
        software.amazon.awscdk.services.iotevents.CfnDetectorModelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
  }
}
