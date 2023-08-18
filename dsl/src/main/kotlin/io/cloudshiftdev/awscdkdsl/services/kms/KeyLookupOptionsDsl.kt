@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.kms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.KeyLookupOptions

/**
 * Properties for looking up an existing Key.
 *
 * Example:
 * ```
 * IKey myKeyLookup = Key.fromLookup(this, "MyKeyLookup", KeyLookupOptions.builder()
 * .aliasName("alias/KeyAlias")
 * .build());
 * Role role = Role.Builder.create(this, "MyRole")
 * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
 * .build();
 * myKeyLookup.grantEncryptDecrypt(role);
 * ```
 */
@CdkDslMarker
public class KeyLookupOptionsDsl {
    private val cdkBuilder: KeyLookupOptions.Builder = KeyLookupOptions.builder()

    /**
     * @param aliasName The alias name of the Key. Must be in the format `alias/&lt;AliasName&gt;`.
     */
    public fun aliasName(aliasName: String) {
        cdkBuilder.aliasName(aliasName)
    }

    public fun build(): KeyLookupOptions = cdkBuilder.build()
}
