package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDevEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun arguments(): Any? = unwrap(this).getArguments()

  public open fun arguments(`value`: Any) {
    unwrap(this).setArguments(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public open fun extraJarsS3Path(): String? = unwrap(this).getExtraJarsS3Path()

  public open fun extraJarsS3Path(`value`: String) {
    unwrap(this).setExtraJarsS3Path(`value`)
  }

  public open fun extraPythonLibsS3Path(): String? = unwrap(this).getExtraPythonLibsS3Path()

  public open fun extraPythonLibsS3Path(`value`: String) {
    unwrap(this).setExtraPythonLibsS3Path(`value`)
  }

  public open fun glueVersion(): String? = unwrap(this).getGlueVersion()

  public open fun glueVersion(`value`: String) {
    unwrap(this).setGlueVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

  public open fun numberOfNodes(`value`: Number) {
    unwrap(this).setNumberOfNodes(`value`)
  }

  public open fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  public open fun numberOfWorkers(`value`: Number) {
    unwrap(this).setNumberOfWorkers(`value`)
  }

  public open fun publicKey(): String? = unwrap(this).getPublicKey()

  public open fun publicKey(`value`: String) {
    unwrap(this).setPublicKey(`value`)
  }

  public open fun publicKeys(): List<String> = unwrap(this).getPublicKeys() ?: emptyList()

  public open fun publicKeys(`value`: List<String>) {
    unwrap(this).setPublicKeys(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  public open fun securityConfiguration(`value`: String) {
    unwrap(this).setSecurityConfiguration(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun workerType(): String? = unwrap(this).getWorkerType()

  public open fun workerType(`value`: String) {
    unwrap(this).setWorkerType(`value`)
  }

  public interface Builder {
    public fun arguments(arguments: Any)

    public fun endpointName(endpointName: String)

    public fun extraJarsS3Path(extraJarsS3Path: String)

    public fun extraPythonLibsS3Path(extraPythonLibsS3Path: String)

    public fun glueVersion(glueVersion: String)

    public fun numberOfNodes(numberOfNodes: Number)

    public fun numberOfWorkers(numberOfWorkers: Number)

    public fun publicKey(publicKey: String)

    public fun publicKeys(publicKeys: List<String>)

    public fun roleArn(roleArn: String)

    public fun securityConfiguration(securityConfiguration: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun subnetId(subnetId: String)

    public fun tags(tags: Any)

    public fun workerType(workerType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDevEndpoint.Builder =
        software.amazon.awscdk.services.glue.CfnDevEndpoint.Builder.create(scope, id)

    override fun arguments(arguments: Any) {
      cdkBuilder.arguments(arguments)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun extraJarsS3Path(extraJarsS3Path: String) {
      cdkBuilder.extraJarsS3Path(extraJarsS3Path)
    }

    override fun extraPythonLibsS3Path(extraPythonLibsS3Path: String) {
      cdkBuilder.extraPythonLibsS3Path(extraPythonLibsS3Path)
    }

    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    override fun numberOfNodes(numberOfNodes: Number) {
      cdkBuilder.numberOfNodes(numberOfNodes)
    }

    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    override fun publicKey(publicKey: String) {
      cdkBuilder.publicKey(publicKey)
    }

    override fun publicKeys(publicKeys: List<String>) {
      cdkBuilder.publicKeys(publicKeys)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnDevEndpoint = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpoint):
        CfnDevEndpoint = CfnDevEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnDevEndpoint):
        software.amazon.awscdk.services.glue.CfnDevEndpoint = wrapped.cdkObject
  }
}
