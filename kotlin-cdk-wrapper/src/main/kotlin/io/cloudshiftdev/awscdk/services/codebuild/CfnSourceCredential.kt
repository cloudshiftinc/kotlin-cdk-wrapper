@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSourceCredential internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredential,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun authType(): String = unwrap(this).getAuthType()

  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serverType(): String = unwrap(this).getServerType()

  public open fun serverType(`value`: String) {
    unwrap(this).setServerType(`value`)
  }

  public open fun token(): String = unwrap(this).getToken()

  public open fun token(`value`: String) {
    unwrap(this).setToken(`value`)
  }

  public open fun username(): String? = unwrap(this).getUsername()

  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun authType(authType: String)

    public fun serverType(serverType: String)

    public fun token(token: String)

    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnSourceCredential.Builder =
        software.amazon.awscdk.services.codebuild.CfnSourceCredential.Builder.create(scope, id)

    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    override fun serverType(serverType: String) {
      cdkBuilder.serverType(serverType)
    }

    override fun token(token: String) {
      cdkBuilder.token(token)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnSourceCredential =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codebuild.CfnSourceCredential.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSourceCredential {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSourceCredential(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredential):
        CfnSourceCredential = CfnSourceCredential(cdkObject)

    internal fun unwrap(wrapped: CfnSourceCredential):
        software.amazon.awscdk.services.codebuild.CfnSourceCredential = wrapped.cdkObject
  }
}
