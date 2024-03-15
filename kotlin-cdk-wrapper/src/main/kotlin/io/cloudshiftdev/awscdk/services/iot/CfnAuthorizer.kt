@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAuthorizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun authorizerFunctionArn(): String = unwrap(this).getAuthorizerFunctionArn()

  public open fun authorizerFunctionArn(`value`: String) {
    unwrap(this).setAuthorizerFunctionArn(`value`)
  }

  public open fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public open fun authorizerName(`value`: String) {
    unwrap(this).setAuthorizerName(`value`)
  }

  public open fun enableCachingForHttp(): Any? = unwrap(this).getEnableCachingForHttp()

  public open fun enableCachingForHttp(`value`: Boolean) {
    unwrap(this).setEnableCachingForHttp(`value`)
  }

  public open fun enableCachingForHttp(`value`: IResolvable) {
    unwrap(this).setEnableCachingForHttp(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun signingDisabled(): Any? = unwrap(this).getSigningDisabled()

  public open fun signingDisabled(`value`: Boolean) {
    unwrap(this).setSigningDisabled(`value`)
  }

  public open fun signingDisabled(`value`: IResolvable) {
    unwrap(this).setSigningDisabled(`value`.let(IResolvable::unwrap))
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun tokenKeyName(): String? = unwrap(this).getTokenKeyName()

  public open fun tokenKeyName(`value`: String) {
    unwrap(this).setTokenKeyName(`value`)
  }

  public open fun tokenSigningPublicKeys(): Any? = unwrap(this).getTokenSigningPublicKeys()

  public open fun tokenSigningPublicKeys(`value`: IResolvable) {
    unwrap(this).setTokenSigningPublicKeys(`value`.let(IResolvable::unwrap))
  }

  public open fun tokenSigningPublicKeys(`value`: Map<String, String>) {
    unwrap(this).setTokenSigningPublicKeys(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun authorizerFunctionArn(authorizerFunctionArn: String)

    public fun authorizerName(authorizerName: String)

    public fun enableCachingForHttp(enableCachingForHttp: Boolean)

    public fun enableCachingForHttp(enableCachingForHttp: IResolvable)

    public fun signingDisabled(signingDisabled: Boolean)

    public fun signingDisabled(signingDisabled: IResolvable)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tokenKeyName(tokenKeyName: String)

    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable)

    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnAuthorizer.Builder =
        software.amazon.awscdk.services.iot.CfnAuthorizer.Builder.create(scope, id)

    override fun authorizerFunctionArn(authorizerFunctionArn: String) {
      cdkBuilder.authorizerFunctionArn(authorizerFunctionArn)
    }

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun enableCachingForHttp(enableCachingForHttp: Boolean) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    override fun enableCachingForHttp(enableCachingForHttp: IResolvable) {
      cdkBuilder.enableCachingForHttp(enableCachingForHttp.let(IResolvable::unwrap))
    }

    override fun signingDisabled(signingDisabled: Boolean) {
      cdkBuilder.signingDisabled(signingDisabled)
    }

    override fun signingDisabled(signingDisabled: IResolvable) {
      cdkBuilder.signingDisabled(signingDisabled.let(IResolvable::unwrap))
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tokenKeyName(tokenKeyName: String) {
      cdkBuilder.tokenKeyName(tokenKeyName)
    }

    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys.let(IResolvable::unwrap))
    }

    override fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>) {
      cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAuthorizer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnAuthorizer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAuthorizer): CfnAuthorizer =
        CfnAuthorizer(cdkObject)

    internal fun unwrap(wrapped: CfnAuthorizer): software.amazon.awscdk.services.iot.CfnAuthorizer =
        wrapped.cdkObject
  }
}
