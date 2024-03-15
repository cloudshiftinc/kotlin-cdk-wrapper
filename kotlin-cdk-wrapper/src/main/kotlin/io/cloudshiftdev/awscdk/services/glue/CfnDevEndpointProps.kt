@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDevEndpointProps {
  public fun arguments(): Any? = unwrap(this).getArguments()

  public fun endpointName(): String? = unwrap(this).getEndpointName()

  public fun extraJarsS3Path(): String? = unwrap(this).getExtraJarsS3Path()

  public fun extraPythonLibsS3Path(): String? = unwrap(this).getExtraPythonLibsS3Path()

  public fun glueVersion(): String? = unwrap(this).getGlueVersion()

  public fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

  public fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  public fun publicKey(): String? = unwrap(this).getPublicKey()

  public fun publicKeys(): List<String> = unwrap(this).getPublicKeys() ?: emptyList()

  public fun roleArn(): String

  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun subnetId(): String? = unwrap(this).getSubnetId()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun workerType(): String? = unwrap(this).getWorkerType()

  @CdkDslMarker
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

    public fun publicKeys(vararg publicKeys: String)

    public fun roleArn(roleArn: String)

    public fun securityConfiguration(securityConfiguration: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetId(subnetId: String)

    public fun tags(tags: Any)

    public fun workerType(workerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDevEndpointProps.Builder =
        software.amazon.awscdk.services.glue.CfnDevEndpointProps.builder()

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

    override fun publicKeys(vararg publicKeys: String): Unit = publicKeys(publicKeys.toList())

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnDevEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpointProps,
  ) : CdkObject(cdkObject), CfnDevEndpointProps {
    override fun arguments(): Any? = unwrap(this).getArguments()

    override fun endpointName(): String? = unwrap(this).getEndpointName()

    override fun extraJarsS3Path(): String? = unwrap(this).getExtraJarsS3Path()

    override fun extraPythonLibsS3Path(): String? = unwrap(this).getExtraPythonLibsS3Path()

    override fun glueVersion(): String? = unwrap(this).getGlueVersion()

    override fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

    override fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    override fun publicKey(): String? = unwrap(this).getPublicKey()

    override fun publicKeys(): List<String> = unwrap(this).getPublicKeys() ?: emptyList()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun subnetId(): String? = unwrap(this).getSubnetId()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun workerType(): String? = unwrap(this).getWorkerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDevEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDevEndpointProps):
        CfnDevEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDevEndpointProps):
        software.amazon.awscdk.services.glue.CfnDevEndpointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnDevEndpointProps
  }
}
