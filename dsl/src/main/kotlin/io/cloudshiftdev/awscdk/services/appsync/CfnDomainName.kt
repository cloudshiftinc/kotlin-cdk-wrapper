package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomainName internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.CfnDomainName,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAppSyncDomainName(): String = unwrap(this).getAttrAppSyncDomainName()

  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrHostedZoneId(): String = unwrap(this).getAttrHostedZoneId()

  public open fun certificateArn(): String = unwrap(this).getCertificateArn()

  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun certificateArn(certificateArn: String)

    public fun description(description: String)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDomainName.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainName.Builder.create(scope, id)

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainName = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainName(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainName):
        CfnDomainName = CfnDomainName(cdkObject)

    internal fun unwrap(wrapped: CfnDomainName):
        software.amazon.awscdk.services.appsync.CfnDomainName = wrapped.cdkObject
  }
}
