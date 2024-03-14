package io.cloudshiftdev.awscdk.services.backupgateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHypervisor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrHypervisorArn(): String = unwrap(this).getAttrHypervisorArn()

  public open fun host(): String? = unwrap(this).getHost()

  public open fun host(`value`: String) {
    unwrap(this).setHost(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

  public open fun logGroupArn(`value`: String) {
    unwrap(this).setLogGroupArn(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun password(): String? = unwrap(this).getPassword()

  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun username(): String? = unwrap(this).getUsername()

  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  public interface Builder {
    public fun host(host: String) {
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
    }

    public fun logGroupArn(logGroupArn: String) {
    }

    public fun name(name: String) {
    }

    public fun password(password: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun username(username: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backupgateway.CfnHypervisor.Builder =
        software.amazon.awscdk.services.backupgateway.CfnHypervisor.Builder.create(scope, id)

    public override fun host(host: String) {
      cdkBuilder.host(host)
    }

    public override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public override fun logGroupArn(logGroupArn: String) {
      cdkBuilder.logGroupArn(logGroupArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun password(password: String) {
      cdkBuilder.password(password)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.backupgateway.CfnHypervisor =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHypervisor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHypervisor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisor):
        CfnHypervisor = CfnHypervisor(cdkObject)

    internal fun unwrap(wrapped: CfnHypervisor):
        software.amazon.awscdk.services.backupgateway.CfnHypervisor = wrapped.cdkObject
  }
}
