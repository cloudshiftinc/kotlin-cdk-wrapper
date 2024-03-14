package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModuleVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDescription(): String = unwrap(this).getAttrDescription()

  public open fun attrDocumentationUrl(): String = unwrap(this).getAttrDocumentationUrl()

  public open fun attrIsDefaultVersion(): IResolvable =
      unwrap(this).getAttrIsDefaultVersion().let(IResolvable::wrap)

  public open fun attrSchema(): String = unwrap(this).getAttrSchema()

  public open fun attrTimeCreated(): String = unwrap(this).getAttrTimeCreated()

  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  public open fun attrVisibility(): String = unwrap(this).getAttrVisibility()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun moduleName(): String = unwrap(this).getModuleName()

  public open fun moduleName(`value`: String) {
    unwrap(this).setModuleName(`value`)
  }

  public open fun modulePackage(): String = unwrap(this).getModulePackage()

  public open fun modulePackage(`value`: String) {
    unwrap(this).setModulePackage(`value`)
  }

  public interface Builder {
    public fun moduleName(moduleName: String)

    public fun modulePackage(modulePackage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnModuleVersion.Builder
        = software.amazon.awscdk.services.cloudformation.CfnModuleVersion.Builder.create(scope, id)

    override fun moduleName(moduleName: String) {
      cdkBuilder.moduleName(moduleName)
    }

    override fun modulePackage(modulePackage: String) {
      cdkBuilder.modulePackage(modulePackage)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnModuleVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModuleVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModuleVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleVersion):
        CfnModuleVersion = CfnModuleVersion(cdkObject)

    internal fun unwrap(wrapped: CfnModuleVersion):
        software.amazon.awscdk.services.cloudformation.CfnModuleVersion = wrapped.cdkObject
  }
}
