package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomainNameApiAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrApiAssociationIdentifier(): String =
      unwrap(this).getAttrApiAssociationIdentifier()

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun apiId(apiId: String)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation.Builder.create(scope,
        id)

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainNameApiAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainNameApiAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation):
        CfnDomainNameApiAssociation = CfnDomainNameApiAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameApiAssociation):
        software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation = wrapped.cdkObject
  }
}
