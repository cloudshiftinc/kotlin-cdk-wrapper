@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit

public interface DatabaseSecretProps {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

  public fun secretName(): String? = unwrap(this).getSecretName()

  public fun username(): String

  @CdkDslMarker
  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun excludeCharacters(excludeCharacters: String)

    public fun masterSecret(masterSecret: ISecret)

    public fun secretName(secretName: String)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseSecretProps.Builder =
        software.amazon.awscdk.services.docdb.DatabaseSecretProps.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret::unwrap))
    }

    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseSecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecretProps,
  ) : CdkObject(cdkObject), DatabaseSecretProps {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

    override fun secretName(): String? = unwrap(this).getSecretName()

    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseSecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecretProps):
        DatabaseSecretProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseSecretProps):
        software.amazon.awscdk.services.docdb.DatabaseSecretProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.DatabaseSecretProps
  }
}
