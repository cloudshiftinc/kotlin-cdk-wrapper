package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFramework internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.CfnFramework,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrDeploymentStatus(): String = unwrap(this).getAttrDeploymentStatus()

  public open fun attrFrameworkArn(): String = unwrap(this).getAttrFrameworkArn()

  public open fun attrFrameworkStatus(): String = unwrap(this).getAttrFrameworkStatus()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun frameworkControls(): Any = unwrap(this).getFrameworkControls()

  public open fun frameworkControls(`value`: IResolvable) {
    unwrap(this).setFrameworkControls(`value`.let(IResolvable::unwrap))
  }

  public open fun frameworkControls(__idx_ac66f0: List<Any>) {
    unwrap(this).setFrameworkControls(__idx_ac66f0)
  }

  public open fun frameworkControls(vararg __idx_ac66f0: Any): Unit =
      frameworkControls(__idx_ac66f0.toList())

  public open fun frameworkDescription(): String? = unwrap(this).getFrameworkDescription()

  public open fun frameworkDescription(`value`: String) {
    unwrap(this).setFrameworkDescription(`value`)
  }

  public open fun frameworkName(): String? = unwrap(this).getFrameworkName()

  public open fun frameworkName(`value`: String) {
    unwrap(this).setFrameworkName(`value`)
  }

  public open fun frameworkTags(): List<CfnTag> = unwrap(this).getFrameworkTags()?.map(CfnTag::wrap)
      ?: emptyList()

  public open fun frameworkTags(`value`: List<CfnTag>) {
    unwrap(this).setFrameworkTags(`value`.map(CfnTag::unwrap))
  }

  public open fun frameworkTags(vararg `value`: CfnTag): Unit = frameworkTags(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun frameworkControls(frameworkControls: IResolvable)

    public fun frameworkControls(frameworkControls: List<Any>)

    public fun frameworkControls(vararg frameworkControls: Any)

    public fun frameworkDescription(frameworkDescription: String)

    public fun frameworkName(frameworkName: String)

    public fun frameworkTags(frameworkTags: List<CfnTag>)

    public fun frameworkTags(vararg frameworkTags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnFramework.Builder =
        software.amazon.awscdk.services.backup.CfnFramework.Builder.create(scope, id)

    override fun frameworkControls(frameworkControls: IResolvable) {
      cdkBuilder.frameworkControls(frameworkControls.let(IResolvable::unwrap))
    }

    override fun frameworkControls(frameworkControls: List<Any>) {
      cdkBuilder.frameworkControls(frameworkControls)
    }

    override fun frameworkControls(vararg frameworkControls: Any): Unit =
        frameworkControls(frameworkControls.toList())

    override fun frameworkDescription(frameworkDescription: String) {
      cdkBuilder.frameworkDescription(frameworkDescription)
    }

    override fun frameworkName(frameworkName: String) {
      cdkBuilder.frameworkName(frameworkName)
    }

    override fun frameworkTags(frameworkTags: List<CfnTag>) {
      cdkBuilder.frameworkTags(frameworkTags.map(CfnTag::unwrap))
    }

    override fun frameworkTags(vararg frameworkTags: CfnTag): Unit =
        frameworkTags(frameworkTags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnFramework = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFramework {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFramework(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework): CfnFramework
        = CfnFramework(cdkObject)

    internal fun unwrap(wrapped: CfnFramework): software.amazon.awscdk.services.backup.CfnFramework
        = wrapped.cdkObject
  }

  public interface FrameworkControlProperty {
    public fun controlInputParameters(): Any? = unwrap(this).getControlInputParameters()

    public fun controlName(): String

    public fun controlScope(): Any? = unwrap(this).getControlScope()

    public interface Builder {
      public fun controlInputParameters(controlInputParameters: IResolvable)

      public fun controlInputParameters(controlInputParameters: List<Any>)

      public fun controlInputParameters(vararg controlInputParameters: Any)

      public fun controlName(controlName: String)

      public fun controlScope(controlScope: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty.Builder =
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty.builder()

      override fun controlInputParameters(controlInputParameters: IResolvable) {
        cdkBuilder.controlInputParameters(controlInputParameters.let(IResolvable::unwrap))
      }

      override fun controlInputParameters(controlInputParameters: List<Any>) {
        cdkBuilder.controlInputParameters(controlInputParameters)
      }

      override fun controlInputParameters(vararg controlInputParameters: Any): Unit =
          controlInputParameters(controlInputParameters.toList())

      override fun controlName(controlName: String) {
        cdkBuilder.controlName(controlName)
      }

      override fun controlScope(controlScope: Any) {
        cdkBuilder.controlScope(controlScope)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty,
    ) : FrameworkControlProperty {
      override fun controlInputParameters(): Any? = unwrap(this).getControlInputParameters()

      override fun controlName(): String = unwrap(this).getControlName()

      override fun controlScope(): Any? = unwrap(this).getControlScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrameworkControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty):
          FrameworkControlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameworkControlProperty):
          software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ControlScopeProperty {
    public fun complianceResourceIds(): List<String> = unwrap(this).getComplianceResourceIds() ?:
        emptyList()

    public fun complianceResourceTypes(): List<String> = unwrap(this).getComplianceResourceTypes()
        ?: emptyList()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun complianceResourceIds(complianceResourceIds: List<String>)

      public fun complianceResourceIds(vararg complianceResourceIds: String)

      public fun complianceResourceTypes(complianceResourceTypes: List<String>)

      public fun complianceResourceTypes(vararg complianceResourceTypes: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty.Builder =
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty.builder()

      override fun complianceResourceIds(complianceResourceIds: List<String>) {
        cdkBuilder.complianceResourceIds(complianceResourceIds)
      }

      override fun complianceResourceIds(vararg complianceResourceIds: String): Unit =
          complianceResourceIds(complianceResourceIds.toList())

      override fun complianceResourceTypes(complianceResourceTypes: List<String>) {
        cdkBuilder.complianceResourceTypes(complianceResourceTypes)
      }

      override fun complianceResourceTypes(vararg complianceResourceTypes: String): Unit =
          complianceResourceTypes(complianceResourceTypes.toList())

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build(): software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty,
    ) : ControlScopeProperty {
      override fun complianceResourceIds(): List<String> = unwrap(this).getComplianceResourceIds()
          ?: emptyList()

      override fun complianceResourceTypes(): List<String> =
          unwrap(this).getComplianceResourceTypes() ?: emptyList()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ControlScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty):
          ControlScopeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlScopeProperty):
          software.amazon.awscdk.services.backup.CfnFramework.ControlScopeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ControlInputParameterProperty {
    public fun parameterName(): String

    public fun parameterValue(): String

    public interface Builder {
      public fun parameterName(parameterName: String)

      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty.builder()

      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty,
    ) : ControlInputParameterProperty {
      override fun parameterName(): String = unwrap(this).getParameterName()

      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ControlInputParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty):
          ControlInputParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ControlInputParameterProperty):
          software.amazon.awscdk.services.backup.CfnFramework.ControlInputParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
