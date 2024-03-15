@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModuleDefaultVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun arn(): String? = unwrap(this).getArn()

  public open fun arn(`value`: String) {
    unwrap(this).setArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun moduleName(): String? = unwrap(this).getModuleName()

  public open fun moduleName(`value`: String) {
    unwrap(this).setModuleName(`value`)
  }

  public open fun versionId(): String? = unwrap(this).getVersionId()

  public open fun versionId(`value`: String) {
    unwrap(this).setVersionId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun arn(arn: String)

    public fun moduleName(moduleName: String)

    public fun versionId(versionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion.Builder =
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion.Builder.create(scope,
        id)

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun moduleName(moduleName: String) {
      cdkBuilder.moduleName(moduleName)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModuleDefaultVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModuleDefaultVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion):
        CfnModuleDefaultVersion = CfnModuleDefaultVersion(cdkObject)

    internal fun unwrap(wrapped: CfnModuleDefaultVersion):
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion = wrapped.cdkObject
  }
}
