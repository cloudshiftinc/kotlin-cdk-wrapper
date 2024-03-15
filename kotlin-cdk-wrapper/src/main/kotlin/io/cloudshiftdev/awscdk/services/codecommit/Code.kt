@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class Code internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codecommit.Code,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): CodeConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(CodeConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.Code,
  ) : Code(cdkObject)

  public companion object {
    public fun fromAsset(asset: Asset): Code =
        software.amazon.awscdk.services.codecommit.Code.fromAsset(asset.let(Asset::unwrap)).let(Code::wrap)

    public fun fromAsset(asset: Asset, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromAsset(asset.let(Asset::unwrap),
        branch).let(Code::wrap)

    public fun fromDirectory(directoryPath: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromDirectory(directoryPath).let(Code::wrap)

    public fun fromDirectory(directoryPath: String, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromDirectory(directoryPath,
        branch).let(Code::wrap)

    public fun fromZipFile(filePath: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromZipFile(filePath).let(Code::wrap)

    public fun fromZipFile(filePath: String, branch: String): Code =
        software.amazon.awscdk.services.codecommit.Code.fromZipFile(filePath,
        branch).let(Code::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.Code): Code =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Code): software.amazon.awscdk.services.codecommit.Code = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.Code
  }
}