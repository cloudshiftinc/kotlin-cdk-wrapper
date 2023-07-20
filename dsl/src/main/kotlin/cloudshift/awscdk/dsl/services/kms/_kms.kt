@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kms

import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.AliasAttributes
import software.amazon.awscdk.services.kms.AliasProps
import software.amazon.awscdk.services.kms.CfnAlias
import software.amazon.awscdk.services.kms.CfnAliasProps
import software.amazon.awscdk.services.kms.CfnKey
import software.amazon.awscdk.services.kms.CfnKeyProps
import software.amazon.awscdk.services.kms.CfnReplicaKey
import software.amazon.awscdk.services.kms.CfnReplicaKeyProps
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeyLookupOptions
import software.amazon.awscdk.services.kms.KeyProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object kms {
    public inline fun alias(
        scope: Construct,
        id: String,
        block: AliasDsl.() -> Unit = {},
    ): Alias {
        val builder = AliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun aliasAttributes(block: AliasAttributesDsl.() -> Unit = {}): AliasAttributes {
        val builder = AliasAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun aliasProps(block: AliasPropsDsl.() -> Unit = {}): AliasProps {
        val builder = AliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAlias(
        scope: Construct,
        id: String,
        block: CfnAliasDsl.() -> Unit = {},
    ): CfnAlias {
        val builder = CfnAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAliasProps(block: CfnAliasPropsDsl.() -> Unit = {}): CfnAliasProps {
        val builder = CfnAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKey(
        scope: Construct,
        id: String,
        block: CfnKeyDsl.() -> Unit = {},
    ): CfnKey {
        val builder = CfnKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKeyProps(block: CfnKeyPropsDsl.() -> Unit = {}): CfnKeyProps {
        val builder = CfnKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicaKey(
        scope: Construct,
        id: String,
        block: CfnReplicaKeyDsl.() -> Unit = {},
    ): CfnReplicaKey {
        val builder = CfnReplicaKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicaKeyProps(block: CfnReplicaKeyPropsDsl.() -> Unit = {}): CfnReplicaKeyProps {
        val builder = CfnReplicaKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun key(
        scope: Construct,
        id: String,
        block: KeyDsl.() -> Unit = {},
    ): Key {
        val builder = KeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun keyLookupOptions(block: KeyLookupOptionsDsl.() -> Unit = {}): KeyLookupOptions {
        val builder = KeyLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun keyProps(block: KeyPropsDsl.() -> Unit = {}): KeyProps {
        val builder = KeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
