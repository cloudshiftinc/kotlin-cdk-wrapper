@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLocationHDFSProps {
  public fun agentArns(): List<String>

  public fun authenticationType(): String

  public fun blockSize(): Number? = unwrap(this).getBlockSize()

  public fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

  public fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

  public fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

  public fun kmsKeyProviderUri(): String? = unwrap(this).getKmsKeyProviderUri()

  public fun nameNodes(): Any

  public fun qopConfiguration(): Any? = unwrap(this).getQopConfiguration()

  public fun replicationFactor(): Number? = unwrap(this).getReplicationFactor()

  public fun simpleUser(): String? = unwrap(this).getSimpleUser()

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun agentArns(agentArns: List<String>)

    public fun agentArns(vararg agentArns: String)

    public fun authenticationType(authenticationType: String)

    public fun blockSize(blockSize: Number)

    public fun kerberosKeytab(kerberosKeytab: String)

    public fun kerberosKrb5Conf(kerberosKrb5Conf: String)

    public fun kerberosPrincipal(kerberosPrincipal: String)

    public fun kmsKeyProviderUri(kmsKeyProviderUri: String)

    public fun nameNodes(nameNodes: IResolvable)

    public fun nameNodes(nameNodes: List<Any>)

    public fun nameNodes(vararg nameNodes: Any)

    public fun qopConfiguration(qopConfiguration: IResolvable)

    public fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02a6bc5c179a7ad22e25b89070542c790b4b1a3559413fa519fb6ce70c684201")
    public
        fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty.Builder.() -> Unit)

    public fun replicationFactor(replicationFactor: Number)

    public fun simpleUser(simpleUser: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationHDFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationHDFSProps.builder()

    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun blockSize(blockSize: Number) {
      cdkBuilder.blockSize(blockSize)
    }

    override fun kerberosKeytab(kerberosKeytab: String) {
      cdkBuilder.kerberosKeytab(kerberosKeytab)
    }

    override fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
      cdkBuilder.kerberosKrb5Conf(kerberosKrb5Conf)
    }

    override fun kerberosPrincipal(kerberosPrincipal: String) {
      cdkBuilder.kerberosPrincipal(kerberosPrincipal)
    }

    override fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
      cdkBuilder.kmsKeyProviderUri(kmsKeyProviderUri)
    }

    override fun nameNodes(nameNodes: IResolvable) {
      cdkBuilder.nameNodes(nameNodes.let(IResolvable::unwrap))
    }

    override fun nameNodes(nameNodes: List<Any>) {
      cdkBuilder.nameNodes(nameNodes)
    }

    override fun nameNodes(vararg nameNodes: Any): Unit = nameNodes(nameNodes.toList())

    override fun qopConfiguration(qopConfiguration: IResolvable) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(IResolvable::unwrap))
    }

    override fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty) {
      cdkBuilder.qopConfiguration(qopConfiguration.let(CfnLocationHDFS.QopConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02a6bc5c179a7ad22e25b89070542c790b4b1a3559413fa519fb6ce70c684201")
    override
        fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty.Builder.() -> Unit):
        Unit = qopConfiguration(CfnLocationHDFS.QopConfigurationProperty(qopConfiguration))

    override fun replicationFactor(replicationFactor: Number) {
      cdkBuilder.replicationFactor(replicationFactor)
    }

    override fun simpleUser(simpleUser: String) {
      cdkBuilder.simpleUser(simpleUser)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationHDFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFSProps,
  ) : CdkObject(cdkObject), CfnLocationHDFSProps {
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

    override fun blockSize(): Number? = unwrap(this).getBlockSize()

    override fun kerberosKeytab(): String? = unwrap(this).getKerberosKeytab()

    override fun kerberosKrb5Conf(): String? = unwrap(this).getKerberosKrb5Conf()

    override fun kerberosPrincipal(): String? = unwrap(this).getKerberosPrincipal()

    override fun kmsKeyProviderUri(): String? = unwrap(this).getKmsKeyProviderUri()

    override fun nameNodes(): Any = unwrap(this).getNameNodes()

    override fun qopConfiguration(): Any? = unwrap(this).getQopConfiguration()

    override fun replicationFactor(): Number? = unwrap(this).getReplicationFactor()

    override fun simpleUser(): String? = unwrap(this).getSimpleUser()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationHDFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationHDFSProps):
        CfnLocationHDFSProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationHDFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationHDFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationHDFSProps
  }
}
