@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDetectorProps {
  public fun associatedModels(): Any? = unwrap(this).getAssociatedModels()

  public fun description(): String? = unwrap(this).getDescription()

  public fun detectorId(): String

  public fun detectorVersionStatus(): String? = unwrap(this).getDetectorVersionStatus()

  public fun eventType(): Any

  public fun ruleExecutionMode(): String? = unwrap(this).getRuleExecutionMode()

  public fun rules(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun associatedModels(associatedModels: IResolvable)

    public fun associatedModels(associatedModels: List<Any>)

    public fun associatedModels(vararg associatedModels: Any)

    public fun description(description: String)

    public fun detectorId(detectorId: String)

    public fun detectorVersionStatus(detectorVersionStatus: String)

    public fun eventType(eventType: IResolvable)

    public fun eventType(eventType: CfnDetector.EventTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b0355883f9cb11ed8e11183a80903d27ae91acc60a4c658ca054bc88543bbf1")
    public fun eventType(eventType: CfnDetector.EventTypeProperty.Builder.() -> Unit)

    public fun ruleExecutionMode(ruleExecutionMode: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun rules(vararg rules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnDetectorProps.Builder =
        software.amazon.awscdk.services.frauddetector.CfnDetectorProps.builder()

    override fun associatedModels(associatedModels: IResolvable) {
      cdkBuilder.associatedModels(associatedModels.let(IResolvable::unwrap))
    }

    override fun associatedModels(associatedModels: List<Any>) {
      cdkBuilder.associatedModels(associatedModels)
    }

    override fun associatedModels(vararg associatedModels: Any): Unit =
        associatedModels(associatedModels.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun detectorVersionStatus(detectorVersionStatus: String) {
      cdkBuilder.detectorVersionStatus(detectorVersionStatus)
    }

    override fun eventType(eventType: IResolvable) {
      cdkBuilder.eventType(eventType.let(IResolvable::unwrap))
    }

    override fun eventType(eventType: CfnDetector.EventTypeProperty) {
      cdkBuilder.eventType(eventType.let(CfnDetector.EventTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b0355883f9cb11ed8e11183a80903d27ae91acc60a4c658ca054bc88543bbf1")
    override fun eventType(eventType: CfnDetector.EventTypeProperty.Builder.() -> Unit): Unit =
        eventType(CfnDetector.EventTypeProperty(eventType))

    override fun ruleExecutionMode(ruleExecutionMode: String) {
      cdkBuilder.ruleExecutionMode(ruleExecutionMode)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetectorProps,
  ) : CdkObject(cdkObject), CfnDetectorProps {
    override fun associatedModels(): Any? = unwrap(this).getAssociatedModels()

    override fun description(): String? = unwrap(this).getDescription()

    override fun detectorId(): String = unwrap(this).getDetectorId()

    override fun detectorVersionStatus(): String? = unwrap(this).getDetectorVersionStatus()

    override fun eventType(): Any = unwrap(this).getEventType()

    override fun ruleExecutionMode(): String? = unwrap(this).getRuleExecutionMode()

    override fun rules(): Any = unwrap(this).getRules()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnDetectorProps):
        CfnDetectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorProps):
        software.amazon.awscdk.services.frauddetector.CfnDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnDetectorProps
  }
}
