@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class MultipartUserData internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.MultipartUserData,
) : UserData(cdkObject) {
  public override fun addCommands(commands: String) {
    unwrap(this).addCommands(commands)
  }

  public override fun addExecuteFileCommand(params: ExecuteFileOptions) {
    unwrap(this).addExecuteFileCommand(params.let(ExecuteFileOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b557a6f4a2ca15b71d1150c77bb51fd8c3435694ec30126636099a14c197a4fd")
  public override fun addExecuteFileCommand(params: ExecuteFileOptions.Builder.() -> Unit): Unit =
      addExecuteFileCommand(ExecuteFileOptions(params))

  public override fun addOnExitCommands(commands: String) {
    unwrap(this).addOnExitCommands(commands)
  }

  public open fun addPart(part: MultipartBody) {
    unwrap(this).addPart(part.let(MultipartBody::unwrap))
  }

  public override fun addS3DownloadCommand(params: S3DownloadOptions): String =
      unwrap(this).addS3DownloadCommand(params.let(S3DownloadOptions::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca5291b6617557daf5643d9f19e97f8894451b651dc29154159b383765d7c98b")
  public override fun addS3DownloadCommand(params: S3DownloadOptions.Builder.() -> Unit): String =
      addS3DownloadCommand(S3DownloadOptions(params))

  public override fun addSignalOnExitCommand(resource: Resource) {
    unwrap(this).addSignalOnExitCommand(resource.let(Resource::unwrap))
  }

  public open fun addUserDataPart(userData: UserData) {
    unwrap(this).addUserDataPart(userData.let(UserData::unwrap))
  }

  public open fun addUserDataPart(userData: UserData, contentType: String) {
    unwrap(this).addUserDataPart(userData.let(UserData::unwrap), contentType)
  }

  public open fun addUserDataPart(
    userData: UserData,
    contentType: String,
    makeDefault: Boolean,
  ) {
    unwrap(this).addUserDataPart(userData.let(UserData::unwrap), contentType, makeDefault)
  }

  public override fun render(): String = unwrap(this).render()

  @CdkDslMarker
  public interface Builder {
    public fun partsSeparator(partsSeparator: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MultipartUserData.Builder =
        software.amazon.awscdk.services.ec2.MultipartUserData.Builder.create()

    override fun partsSeparator(partsSeparator: String) {
      cdkBuilder.partsSeparator(partsSeparator)
    }

    public fun build(): software.amazon.awscdk.services.ec2.MultipartUserData = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultipartUserData {
      val builderImpl = BuilderImpl()
      return MultipartUserData(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MultipartUserData):
        MultipartUserData = MultipartUserData(cdkObject)

    internal fun unwrap(wrapped: MultipartUserData):
        software.amazon.awscdk.services.ec2.MultipartUserData = wrapped.cdkObject
  }
}
