package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.Secret
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DatabaseSecret internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecret,
) : Secret(cdkObject) {
  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun excludeCharacters(excludeCharacters: String)

    public fun masterSecret(masterSecret: ISecret)

    public fun secretName(secretName: String)

    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseSecret.Builder =
        software.amazon.awscdk.services.docdb.DatabaseSecret.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseSecret = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DatabaseSecret {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DatabaseSecret(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseSecret):
        DatabaseSecret = DatabaseSecret(cdkObject)

    internal fun unwrap(wrapped: DatabaseSecret):
        software.amazon.awscdk.services.docdb.DatabaseSecret = wrapped.cdkObject
  }
}
