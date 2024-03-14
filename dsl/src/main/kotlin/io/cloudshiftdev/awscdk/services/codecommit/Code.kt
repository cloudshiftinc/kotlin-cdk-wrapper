package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class Code internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codecommit.Code,
) {
  public open fun bind(arg0: Construct): CodeConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(CodeConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codecommit.Code,
  ) : Code(cdkObject)

  public companion object {
    public open fun fromAsset(asset: Asset): Code =
        software.amazon.awscdk.services.codecommit.Code.fromAsset(asset.let(Asset::unwrap)).let(Code::wrap)

    public open fun fromAsset(asset: Asset, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromAsset(asset.let(Asset::unwrap),
        branch).let(Code::wrap)

    public open fun fromDirectory(directoryPath: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromDirectory(directoryPath).let(Code::wrap)

    public open fun fromDirectory(directoryPath: String, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromDirectory(directoryPath,
        branch).let(Code::wrap)

    public open fun fromZipFile(filePath: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromZipFile(filePath).let(Code::wrap)

    public open fun fromZipFile(filePath: String, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromZipFile(filePath,
        branch).let(Code::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.Code): Code =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.codecommit.Code = (wrapped
        as Wrapper).cdkObject
  }
}
