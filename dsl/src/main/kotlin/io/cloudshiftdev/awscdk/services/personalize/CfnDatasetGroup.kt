package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatasetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDatasetGroupArn(): String = unwrap(this).getAttrDatasetGroupArn()

  public open fun domain(): String? = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun domain(domain: String) {
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
    }

    public fun name(name: String) {
    }

    public fun roleArn(roleArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDatasetGroup.Builder =
        software.amazon.awscdk.services.personalize.CfnDatasetGroup.Builder.create(scope, id)

    public override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    public override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDatasetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatasetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatasetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroup):
        CfnDatasetGroup = CfnDatasetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroup):
        software.amazon.awscdk.services.personalize.CfnDatasetGroup = wrapped.cdkObject
  }
}
